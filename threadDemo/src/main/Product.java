/**
 * Created by 赵人德 on 2019-04-11.
 * 商品仓库
 */
public class Product {
    private int count = 0;// 商品数量
    private int MAX = 2;// 最大库存

    // 生产商品
    public synchronized void makeProduct() {
        String thread_name = Thread.currentThread().getName();// 获取生产者线程名
        if (count >= MAX) {
            System.out.println("货物已满" + thread_name + "停止生产...");
            try {
                notifyAll(); // 唤醒所有的消费者线程
                wait(); // 生产者线程停止生产
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++; // 生产者线程生产商品
            System.out.println(thread_name + "生产了产品，目前商品总量：" + count);
        }
    }

    // 消费商品
    public synchronized void buyProduct() {
        String thread_name = Thread.currentThread().getName();// 获取线程名
        if (count <= 0) {
            System.out.println("已无货，" + thread_name + "停住消费...");
            try {
                notifyAll();// 唤醒生产者线程 生产商品
                wait();// 消费者线程休眠，停止消费
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;// 开始 消费商品
            System.out.println(thread_name + "消费了一个商品，目前商品数量为：" + count);
        }
    }
}
