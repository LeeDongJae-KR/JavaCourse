package chapter2.capsulation.v1;

public class DataStore {

    private String store;

    public void setStore(String store) {
        if(store.equals("B")){
            System.out.println("B가 입력되면 안됩니다.");
        }
        this.store = store;
    }
}
