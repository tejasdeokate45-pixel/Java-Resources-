// Driving licence procedure
// Medical-> TestDrive -> OfficerAllot ->DrivingLicenceGet
public class Main {
    public static void main(String[] args)throws Exception{
        Medical m = new Medical();
        m.start();
        //m.join();

        DrivingTest dt = new DrivingTest();
        dt.start();
        //dt.join();

        OfficerAloted oa = new OfficerAloted();
        oa.start();
        //oa.join();
    }
}

class Medical extends Thread {
    public void run(){

        System.out.println("Medical Started :: ");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Medical Passes :: ");
    }
}

class DrivingTest extends Thread{
    public void run(){

        System.out.println("Driving Test  Started :: ");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Driving Test  Started :: ");
    }
}

class OfficerAloted extends Thread{
    public void run(){

        System.out.println("Officer Aloted :: ");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Approved Licence :: ");
    }
}