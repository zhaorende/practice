import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * Created by 赵人德 on 2019-04-12.
 */
public class HandlerExecutorPool {
    private ExecutorService executor;
    public HandlerExecutorPool(int maxPoolSize, int queueSize){
        this.executor = new ThreadPoolExecutor(
                Runtime.getRuntime().availableProcessors(),
                maxPoolSize,
                120L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(queueSize));
    }

    public void execute(Runnable task){
        this.executor.execute(task);
    }
}
