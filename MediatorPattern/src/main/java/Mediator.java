public interface Mediator {
    public void register(Employee employee);
    public void sendMessage(Employee fromEmployee,Employee toEmployee, String msg) throws InterruptedException;
}
