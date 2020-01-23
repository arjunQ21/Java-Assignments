class TaskDemo{
    public static void main(String[] args){
        Task task1 = new Task() ;
        task1.name = "Study Java" ;
        task1.isComplete = false ;
        Task task2 = new Task("second task ");
        System.out.println("Task Name: " + task1.name);
        System.out.println("\nTask Name: " + task2.name);
        Task task3 = new Task(task2) ;
        System.out.println("\nTask 3 Name: " + task3.name);
    }
}
