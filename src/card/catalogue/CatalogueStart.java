/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.catalogue;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Rob
 */
public class CatalogueStart {
            
    private Date date = new Date();
    private String dateString = date.toString();
    ArrayList<CatalogueClass> cardList = new ArrayList<>();

    public CatalogueStart() {
    }

    public CatalogueStart(ArrayList<CatalogueClass> cList){
        MainMenu menu = new MainMenu(cList);
        menu.setVisible(true);
    }

    public int catalogNumber(){
        return cardList.size();
    }
    
    public void addToList(ArrayList<CatalogueClass> List, CatalogueClass c){
        List.add(c);
    }

    public ArrayList<CatalogueClass> getList(){
        return this.cardList;
    }
}
