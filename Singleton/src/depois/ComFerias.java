package depois;


public class ComFerias implements Ferias {

    @Override
    public void calcularFerias() {
        System.out.println("Com férias");
        SingletonLog.getInstance().doLog("Houve um cálculo de férias");
    }
    
}
