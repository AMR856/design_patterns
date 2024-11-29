public abstract class DatabaseRecord {
    public final void save(){
        beforeSave();
        if (validate()) {
            System.out.println("Model is validated");
            System.out.println("--------------------");
            // Saving to the database
        }
        else System.out.println("Model is not validated");
    }
    public abstract boolean validate();
    public void beforeSave(){}
}
