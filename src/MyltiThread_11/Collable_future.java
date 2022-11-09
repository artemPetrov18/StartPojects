package MyltiThread_11;




import java.util.concurrent.*;

public class Collable_future {
    static int fucktorial;
    /*
    *
    * Интерейс Callable такойже как Runble также служит для выполнения саданий
    * но он используеться только Exucutersevice ThreadPool
    * 1.Главное отличие это то что Callable возращает задание после выполнения задания,
    * так как Runblle имеет void
    * 2.Он может выбрасывать ошибку
    *
    *
    *
    * isTreminate - возвращает бул если поток не закничил роботу тогда фалсе
    *   IsDone -выполнен таск или нетget
    * */
    public static void main(String[] args) throws InterruptedException {
        ExecutorService execut= Executors.newSingleThreadExecutor();
        CountFuck fuk=new CountFuck(5);

        Future<Integer> fut=  execut.submit(fuk);
        try {
            fucktorial=fut.get();           // метод get блокируте выполнение потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            execut.shutdown();
        }


        System.out.println(fucktorial);

    }
}

class CountFuck implements Callable<Integer>{
    int f;

    public CountFuck(int f) {
        this.f = f;
    }

    @Override
    public Integer call() {
       if(f==0){
           try {
               throw new Exception();
           } catch (Exception e) {
               System.out.println("dayn");;
           }
       }
       int result=1;
        for (int i = 1; i <=f; i++) {
            result*=i;
        }

        return result;
    }


}
