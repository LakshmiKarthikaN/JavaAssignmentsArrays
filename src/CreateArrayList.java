class ToArrayList {
    private int[] data;
    private int size;
    public ToArrayList() {
        data = new int[5];
        size = 0;
    }
    public void add(int value) {
        if (size == data.length) {
            resize();  // Increase array size when full
        }
        data[size] = value;
        size++;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }
    public void remove(){
        if (size == 0) {
            System.out.println("List is empty!");
            return;
        }
        size--;
    }
    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    public int size() {
        return size;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
public class  CreateArrayList{
    public static void main(String[] args) {
        ToArrayList list = new ToArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.print();

        System.out.println("Element at index : " + list.get(3));


        list.print();

        System.out.println("Size: " + list.size());
    }
}
