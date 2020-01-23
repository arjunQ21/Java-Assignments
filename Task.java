class Task{
	public String name ;
    public boolean isComplete ;
    public Task(){

    }
    public Task(String name){
        this.name = name ;
        isComplete = false ;
    }
    public Task (Task obj){
        name = obj.name ;
        isComplete = obj.isComplete ;
    }
    public void markAsComplete(){
        isComplete = true ;
    }
    public void markAsIncomplete(){
        isComplete = false;
    }

}
