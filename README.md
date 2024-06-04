# I am learning java and decided to try to create another single linked-list.
**This list uses generics and also implements List\<T> interface.**
## Methods:

- [x] `size()`         <div style='text-align: center;'> Gives size of List </div>
- [x] `clear()`        <div style='text-align: center;'> Deletes all elements of List </div>
- [x] `isEmpty()`      <div style='text-align: center;'> Checks if List is empty </div>
- [x] `contains()`     <div style='text-align: center;'> Checks if element in List </div>
- [ ] `containsAll()`  <div style='text-align: center;'> Checks if **all** of elements in List </div>
- [x] `get()`          <div align='text-align: center;'> Returns element by index </div>
- [x] `add()`          <div align='text-align: center;'> Adds element in the List(at the tail or by index) </div>
- [x] `addAll()`       <div align='text-align: center;'> Adds **all** elements from Collection(at the tail or by index) </div>
- [x] `remove()`       <div align='text-align: center;'> Removes element by index or by value </div>
- [ ] `removeAll()`    <div align='text-align: center;'> Removes **all** elements from Collection </div>
- [ ] `retainAll()`    <div align='text-align: center;'> Leaves *only* elements from Collection </div>
- [x] `indexOf()`      <div align='text-align: center;'> Returns index of *first* element equals given </div>
- [ ] `lastIndexOf()`  <div align='text-align: center;'> Returns index of *last* element equals given </div>
- [ ] `iterator`       <div align='text-align: center;'> Creates Iterator from List </div>
- [ ] `listIterator`   <div align='text-align: center;'> Creates ListIterator from List(full or from index) </div>
- [x] `toArray()`      <div align='text-align: center;'> Returns Object[] or T[] of the List </div>
- [x] `toString()`     <div align='text-align: center;'> Override of Object super, just beautiful toString </div>
- [x] `equals()`       <div align='text-align: center;'> Comparison by elements of List </div>
- [x] `hashCode()`     <div align='text-align: center;'> HashCode by `Array.hashCode()` </div>

## There are some constructors in Linked-List:
* `LinkedList()` | Default constructor
* `LinkedList(T element)` | Add element in the head of List
* `LinkedList(Collection<? extends T> elements)` | Add elements in the head of List by using addAll()

### My next goals:
### 1. Finish remaining methods
### 2. Add the ability to work in a for each loop
