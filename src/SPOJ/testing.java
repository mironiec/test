package SPOJ;


import struktury.BinarneDrzewoPrzeszukiwan;
import struktury.BinarySearch;

public class testing {

     public static void BST(){
        BinarneDrzewoPrzeszukiwan bst = new BinarneDrzewoPrzeszukiwan();
        bst.dodaj(5);
        bst.dodaj(2);
        bst.dodaj(7);
        bst.dodaj(10);
        bst.dodaj(3);
        bst.dodaj(6);
        bst.dodaj(15);
        bst.dodaj(21);
        bst.dodaj(1);
        bst.usun(1);
         System.out.println(bst);
    }
    public static void main(String[] args) throws NullPointerException{
        BST();

    }
}

