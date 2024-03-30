package Consumer_Producer;

public class Store {
    private int maxShirt=10;

    private int no_of_shirt;

    public int getMaxShirt() {
        return maxShirt;
    }

    public void setNo_of_shirt(int no_of_shirt) throws Exception {
        if(no_of_shirt>maxShirt) {
            throw new Exception("hello"+no_of_shirt);
        }
        this.no_of_shirt=no_of_shirt;
    }

    public int getNo_of_shirt() {
        return no_of_shirt;
    }
}
