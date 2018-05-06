/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.catalogue;

/**
 *
 * @author Rob
 */
public class CatalogueClass {
    private int cardID;
    private String bookTitle;
    private String bookAuthor;
    private int yearPublished;
    private String dateAdded;
    private String dateUpdated;
    private String addedBy;
    private String updatedBy;
    
    public CatalogueClass(int cardID, String bookTitle, String bookAuthor, int yearPublished,
                        String dateAdded, String dateUpdated, String addedBy, String updatedBy)
    {
        this.cardID = cardID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
        this.dateAdded = dateAdded;
        this.dateUpdated = dateUpdated;
        this.addedBy = addedBy;
        this.updatedBy = updatedBy;
    }
    
    public String getBookName(){
        return this.bookTitle;
    }
    
    public CatalogueClass getCard(){
        return this;
    }
}
