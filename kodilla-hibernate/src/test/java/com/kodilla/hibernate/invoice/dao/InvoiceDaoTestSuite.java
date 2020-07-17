package com.kodilla.hibernate.invoice.dao;



import com.kodilla.hibernate.invoice.Product;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
     InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product pen = new Product("Pen");
        Product pencil = new Product("Pencil");
        Product book = new Product("Book");
        Product notebook = new Product("Notebook");

//        Item item = new Item(new BigDecimal(2), 9, new BigDecimal(20));
//        Item item2 = new Item(new BigDecimal(50), 1000, new BigDecimal(30));
//        item.setProduct(pen);
//        item.setProduct(pencil);
//        item2.setProduct(book);
//        item2.setProduct(notebook);
//        Invoice invoice = new Invoice("1233445");
//        invoice.getItems().add(item);
//        invoice.getItems().add(item2);


//        //When
//        invoiceDao.save(invoice);
//        int id = invoice.getId();

        //Then
//        Assert.assertNotEquals(0, id);

        //CleanUp
       // invoiceDao.deleteById(id);

    }
}
