/**
 * Created by 赵人德 on 2019-04-11.
 * 生产者
 */
public class Producer implements Runnable {

    private Product product; // 获取Product对象

    public Producer(Product product) {
        this.product = product;
    }

    public void run() {
        while (true) {
            product.makeProduct();// 调用生产方法
        }
    }
}
