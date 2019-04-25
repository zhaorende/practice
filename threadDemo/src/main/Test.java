/**
 * Created by 赵人德 on 2019-04-11.
 * 测试类
 */
public class Test {
    public static void main(String[] arg){
        Product product = new Product();
        new Thread(new Producer(product),"生产者一号-->").start();
        /*new Thread(new Producer(product),"生产者二号-->").start();
        new Thread(new Producer(product),"生产者三号-->").start();
        new Thread(new Producer(product),"生产者四号-->").start();*/
        new Thread(new Consumer(product),"消费者A号-->").start();
        new Thread(new Consumer(product),"消费者B号-->").start();
        /*new Thread(new Consumer(product),"消费者C号-->").start();
        new Thread(new Consumer(product),"消费者D号-->").start();
        new Thread(new Consumer(product),"消费者E号-->").start();
        new Thread(new Consumer(product),"消费者F号-->").start();*/
    }
}
