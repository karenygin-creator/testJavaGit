public record TestRecord(String name,int age) {
    public static final String COMPANY = "company";
    public void print() {
        System.out.println(name+":"+age+" "+COMPANY);
    }
}
