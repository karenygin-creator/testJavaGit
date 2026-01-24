public interface Printable {
    int ABOBA=99;
    default void print(){
        System.out.println("Printable");
    };
    private int sum(int a){
        return 0;
    }

}
