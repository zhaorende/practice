/**
 * Created by 赵人德 on 2019-04-11.
 * 消费者
 */
public class Consumer implements Runnable {
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    public void run() {
        while (true) {
            product.buyProduct();//调用消费方法
        }
    }
}
