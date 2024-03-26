public class CPU {
    int rafaga;
    int tiempo_cpu;
    public CPU(Memoria m, int rafaga){
        this.rafaga = rafaga;
        System.out.println("CPU inicializado, con una rafaga de "+rafaga+" msg");
        tiempo_cpu=0;
    }
    //Resta t_ejecución a proceso por la rafaga, una vez haya concluido su rafaga, se manda a la cola de procesos en espera
    public void SubirP(Memoria m, FIFO c){
        //se saca proceso de la cola de procesos listos para ejecución
       Proceso p =  m.quitar();
       //se realiza la resta del tiempo según la ráfaga
       for(int i=rafaga;i>=0;i--){
        System.out.println("Proceso P"+p.getid()+" en ejecución "+i+" msg");
        if(p.gettmp() > 0){
          p.restartmp();    
        }else{
            System.out.println("Proceso P"+p.getid()+" ha concluido su ejecución");
            break;
        }  
       }
       //Si aun no termina su ejecución se vuelve a formar en la cola de procesos listos 
       if(p.gettmp()>0){
         c.insertar(p);   
       }else{
           //si ya terminó no se hace nada
       }
    }
}