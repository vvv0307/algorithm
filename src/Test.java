public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                while(true){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("interrupt");
                        break;
                    }
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.out.println("interruped when sleep");
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
