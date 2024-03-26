public class CPU {
    private int tiempo_cpu;
    private int timeSlice; // Time slice for Round Robin scheduling

    public CPU(Memoria memoria, int timeSlice) {
        this.timeSlice = timeSlice;
        System.out.println("CPU inicializado, con un time slice de " + timeSlice + " ms");
        tiempo_cpu = 0;
    }

    // Executes processes in a Round Robin manner with the specified time slice
    public void executeProcesses(Memoria memoria, FIFO colaProcesos) {
        while (!colaProcesos.isEmpty()) {
            Proceso proceso = colaProcesos.quitar();
            System.out.println("Proceso P" + proceso.getId() + " en ejecución durante " + timeSlice + " ms");

            if (proceso.getTmp() > timeSlice) {
                proceso.restarTmp(timeSlice);
                colaProcesos.insertar(proceso); // Reinsert the process into the queue
            } else {
                System.out.println("Proceso P" + proceso.getId() + " ha concluido su ejecución");
            }
        }
    }
}
