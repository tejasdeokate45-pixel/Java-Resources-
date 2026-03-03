// Driving licence procedure
// Medical-> TestDrive -> OfficerAllot ->DrivingLicenceGet
public class JoinInThreadClass {
    public static void main(String[] args)throws Exception{
        Medicals m = new Medicals();
        m.start();
        //m.join();

        DrivingTests dt = new DrivingTests();
        dt.start();
        //dt.join();

        OfficerAloteds oa = new OfficerAloteds();
        oa.start();
        //oa.join();
    }
}

class Medicals extends Thread {
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

class DrivingTests extends Thread{
    public void run() {
        Medicals m = new Medicals();
        try {
            m.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Driving Test  Started :: ");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Driving Test  Started :: ");
    }
}

class OfficerAloteds extends Thread{
    public void run(){
        DrivingTests dt = new DrivingTests();
        try {
            dt.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }


        System.out.println("Officer Aloted :: ");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Approved Licence :: ");
    }
}