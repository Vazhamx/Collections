package Vazhmax;

import java.util.Objects;

public class LinkedList {
    private Cell startCell;
    private boolean isClear = true;
    
    public int get(int index){
        int counter = 0;
        Cell currentValue = startCell;
        while(counter != index) {
            if(currentValue.nextElement == null){
                throw new ArrayIndexOutOfBoundsException();
            }
            currentValue = currentValue.nextElement;
            counter++;
        }
        return currentValue.value;
    }
    
    public void add(int value){
        if(isClear){
            startCell = new Cell(value);
            isClear = false;
        }
        else{
            Cell currentCell = startCell;
            Cell newCell = new Cell(value);
            while (currentCell.nextElement != null) {
                currentCell = currentCell.nextElement;
            }
            currentCell.nextElement = newCell;
        }
    }
    
    

    public void add(int index, int value){
        //TODO index add
    }

    public int length() {
        if(isClear) return 0;
        Cell currentCell = startCell;
        int length = 0;
        while (currentCell != null) {
            currentCell = currentCell.nextElement;
            length++;
        }
        
        return length;
    }

    @Override
    public String toString() {
        if(isClear) return "[]";
        Cell currentCell = startCell;
        StringBuilder stringBuilder = new StringBuilder("[");
        while(currentCell != null){
            stringBuilder.append(currentCell.value).append(", ");
            currentCell = currentCell.nextElement;
        }
        stringBuilder.delete(stringBuilder.length() -2, stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        LinkedList list = (LinkedList) obj;
        if(length() != list.length()) return false;
        for (int i = 0; i < length(); i++){
            if(get(i) != list.get(i))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(startCell.value);
    }
}
