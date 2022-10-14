package Ex05TruthCarandang;

import java.util.ArrayList;
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList = new ArrayList();
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    earnings = 0;
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void addItem(Item i){
    itemList.add(i);
  }
  public void sellItem(int index){
      if(index < itemList.size()){
          earnings += itemList.get(index).getCost();
          System.out.printf("A %s in %s has been sold for %.2f. %s now has %.2f in earnings.%n", itemList.get(index).getName(), name, itemList.get(index).getCost(), name, earnings);
      }
      else{
          System.out.println("Could not find item.");
      }
  }
  public void sellItem(String name){
      boolean found = false;
      for(Item i : itemList){
          if(i.getName() == name){
              found = true;
              earnings += i.getCost();
              System.out.printf("A %s in %s has been sold for %.2f. %s now has %.2f in earnings.%n", i.getName(), this.name, i.getCost(), this.name, earnings);
          }
      }
      if(!found){
          System.out.println("Could not find item.");
      }
  }
  public void sellItem(Item i){
      if(itemList.contains(i)){
          earnings += i.getCost();
          System.out.printf("A %s in %s has been sold for %.2f. %s now has %.2f in earnings.%n", i.getName(), name, i.getCost(), name, earnings);
      }
      else{
          System.out.println("Could not find item.");
      }
  }
  public void filterType(String type){
      System.out.printf("All %s items:%n", type);
      for(Item i : itemList){
          if(i.getType() == type){
              System.out.println(i.getName());
          }
      }
  }
  public void filterCheap(double maxCost){
      System.out.printf("All items with %.2f maximum cost:%n", maxCost);
      for(Item i : itemList){
          if(i.getCost() <= maxCost){
              System.out.println(i.getName());
          }
      }
  }
  public void filterExpensive(double minCost){
      System.out.printf("All items with %.2f minimum cost:%n", minCost);
      for(Item i : itemList){
          if(i.getCost()>= minCost){
              System.out.println(i.getName());
          }
      }
  }
  public static void printStats(){
      System.out.println("Store stats:");
      for(Store i : storeList){
          System.out.printf("Name: %s     Earnings: %.2f%n", i.getName(), i.getEarnings());
      }
  }
}
