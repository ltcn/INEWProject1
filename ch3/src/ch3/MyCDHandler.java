/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.util.ArrayList;
import java.util.List;

 
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author ltcn
 */
public class MyCDHandler extends DefaultHandler {
    private List<CD> cdList = null;
    private CD cdtmp = null;
    
    public List<CD> getCDList(){
        return cdList;
    }
    
    int index = 0;
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        if (qName.equalsIgnoreCase("CD")) {
            cdtmp = new CD();
            if(cdList == null){
                cdList = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("TITLE")){
            index = 1;
        } else if (qName.equalsIgnoreCase("ARTIST")){
            index = 2;
        } else if (qName.equalsIgnoreCase("COUNTRY")){
            index = 3;
        } else if (qName.equalsIgnoreCase("COMPANY")){
            index = 4;
        } else if (qName.equalsIgnoreCase("PRICE")){
            index = 5;
        } else if (qName.equalsIgnoreCase("YEAR")){
            index = 6;
        }
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("CD")) {
            //add Employee object to list
            cdList.add(cdtmp);
        }
    }
    
     @Override
    public void characters(char ch[], int start, int length) throws SAXException {
 
        switch (index){
            case 1:
                cdtmp.setTitle(new String(ch, start, length));
                index = 0;
                break;
            case 2:
                cdtmp.setArtist(new String(ch, start, length));
                index = 0;
                break;
            case 3:
                cdtmp.setCountry(new String(ch, start, length));
                index = 0;
                break;
            case 4:
                cdtmp.setCompany(new String(ch, start, length));
                index = 0;
                break;
            case 5:
                cdtmp.setPrice(new String(ch, start, length));
                index = 0;
                break;
            case 6:
                cdtmp.setYear(Integer.parseInt(new String(ch, start, length)));
                index = 0;
                break;
            default:
                
        }
    }
    
    
}
