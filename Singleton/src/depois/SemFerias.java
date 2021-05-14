package depois;


public class SemFerias implements Ferias {

    @Override
    public void calcularFerias() {
        System.out.println("Sem férias");
        SingletonLog.getInstance().doLog("Houve uma tentativa de cáculo para funcionário sem férias.");
        
    }
    
}
