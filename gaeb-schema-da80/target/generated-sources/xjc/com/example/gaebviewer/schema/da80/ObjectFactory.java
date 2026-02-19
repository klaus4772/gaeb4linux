//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.gaebviewer.schema.da80 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GAEB_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "GAEB");
    private static final QName _TgRefItems2Customer_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Customer");
    private static final QName _TgRefItems2CustomerSubNo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "CustomerSubNo");
    private static final QName _TgRefItems2CustomerCtlgAssign_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "CustomerCtlgAssign");
    private static final QName _TgRefItems2Supplier_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Supplier");
    private static final QName _TgRefItems2SupplierSubNo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "SupplierSubNo");
    private static final QName _TgRefItems2SupplierCtlgAssign_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "SupplierCtlgAssign");
    private static final QName _TgtdTC2P_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "p");
    private static final QName _TgtdTC2Div_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "div");
    private static final QName _TgtdTC2Span_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "span");
    private static final QName _TgtdTC2Br_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "br");
    private static final QName _TgtdTC2Table_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "table");
    private static final QName _TgtdTC2Ol_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "ol");
    private static final QName _TgtdTC2Ul_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "ul");
    private static final QName _TgtdTC2TextComplement_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "TextComplement");
    private static final QName _TgpTC2Image_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "image");
    private static final QName _TgFText2Page_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "page");
    private static final QName _TgFText2Image_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Image");
    private static final QName _TgBoQText2Text_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Text");
    private static final QName _TgBoQText2Attachment_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "attachment");
    private static final QName _OriginalTgItemALNGroupNo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "ALNGroupNo");
    private static final QName _OriginalTgItemALNSerNo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "ALNSerNo");
    private static final QName _OriginalTgItemAccepted_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Accepted");
    private static final QName _OriginalTgItemProvis_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Provis");
    private static final QName _OriginalTgItemProvisAccpt_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "ProvisAccpt");
    private static final QName _OriginalTgItemLumpSumItem_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "LumpSumItem");
    private static final QName _OriginalTgItemNotAppl_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "NotAppl");
    private static final QName _OriginalTgItemNotOffered_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "NotOffered");
    private static final QName _OriginalTgItemHourIt_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "HourIt");
    private static final QName _OriginalTgItemKeyIt_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "KeyIt");
    private static final QName _OriginalTgItemUPBkdn_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPBkdn");
    private static final QName _OriginalTgItemMarkupIt_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "MarkupIt");
    private static final QName _OriginalTgItemCONo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "CONo");
    private static final QName _OriginalTgItemCOStatus_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "COStatus");
    private static final QName _OriginalTgItemRefDescr_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "RefDescr");
    private static final QName _OriginalTgItemRefRNo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "RefRNo");
    private static final QName _OriginalTgItemRefPerfNo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "RefPerfNo");
    private static final QName _OriginalTgItemHoldOutType_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "HoldOutType");
    private static final QName _OriginalTgItemUseDur_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UseDur");
    private static final QName _OriginalTgItemUseDurLblTime_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UseDurLblTime");
    private static final QName _OriginalTgItemRefBaseItem_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "RefBaseItem");
    private static final QName _OriginalTgItemQtyTBD_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "QtyTBD");
    private static final QName _OriginalTgItemQty_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Qty");
    private static final QName _OriginalTgItemQtySplit_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "QtySplit");
    private static final QName _OriginalTgItemPredQty_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "PredQty");
    private static final QName _OriginalTgItemBillQty_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "BillQty");
    private static final QName _OriginalTgItemQU_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "QU");
    private static final QName _OriginalTgItemCtlgAssign_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "CtlgAssign");
    private static final QName _OriginalTgItemUP_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UP");
    private static final QName _OriginalTgItemUP110_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UP110");
    private static final QName _OriginalTgItemUPComp1_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPComp1");
    private static final QName _OriginalTgItemUPComp2_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPComp2");
    private static final QName _OriginalTgItemUPComp3_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPComp3");
    private static final QName _OriginalTgItemUPComp4_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPComp4");
    private static final QName _OriginalTgItemUPComp5_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPComp5");
    private static final QName _OriginalTgItemUPComp6_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPComp6");
    private static final QName _OriginalTgItemDiscountPcnt_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "DiscountPcnt");
    private static final QName _OriginalTgItemUPFrom_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPFrom");
    private static final QName _OriginalTgItemUPAvg_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPAvg");
    private static final QName _OriginalTgItemUPTo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPTo");
    private static final QName _OriginalTgItemUPWgFrom_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPWgFrom");
    private static final QName _OriginalTgItemUPWgAvg_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPWgAvg");
    private static final QName _OriginalTgItemUPWgTo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "UPWgTo");
    private static final QName _OriginalTgItemIT_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "IT");
    private static final QName _OriginalTgItemVAT_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "VAT");
    private static final QName _OriginalTgItemPriceInfo_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "PriceInfo");
    private static final QName _OriginalTgItemTimeQu_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "TimeQu");
    private static final QName _OriginalTgItemDescription_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Description");
    private static final QName _OriginalTgItemBidComm_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "BidComm");
    private static final QName _OriginalTgItemSumDescr_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "SumDescr");
    private static final QName _OriginalTgItemSubDescr_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "SubDescr");
    private static final QName _OriginalTgItemProduct_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "Product");
    private static final QName _OriginalTgItemAlterBidStatus_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "AlterBidStatus");
    private static final QName _OriginalTgItemCostApproach_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "CostApproach");
    private static final QName _OriginalTgItemCheckNote_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "CheckNote");
    private static final QName _OriginalTgItemQtyDeterm_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "QtyDeterm");
    private static final QName _OriginalTgItemBidUpDownReq_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "BidUpDownReq");
    private static final QName _OriginalTgItemBidUpDownPct_QNAME = new QName("http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", "BidUpDownPct");
    private static final QName _TgRefItemsCustomer_QNAME = new QName("", "Customer");
    private static final QName _TgRefItemsCustomerSubNo_QNAME = new QName("", "CustomerSubNo");
    private static final QName _TgRefItemsCustomerCtlgAssign_QNAME = new QName("", "CustomerCtlgAssign");
    private static final QName _TgRefItemsSupplier_QNAME = new QName("", "Supplier");
    private static final QName _TgRefItemsSupplierSubNo_QNAME = new QName("", "SupplierSubNo");
    private static final QName _TgRefItemsSupplierCtlgAssign_QNAME = new QName("", "SupplierCtlgAssign");
    private static final QName _TgtdTCP_QNAME = new QName("", "p");
    private static final QName _TgtdTCDiv_QNAME = new QName("", "div");
    private static final QName _TgtdTCSpan_QNAME = new QName("", "span");
    private static final QName _TgtdTCBr_QNAME = new QName("", "br");
    private static final QName _TgtdTCTable_QNAME = new QName("", "table");
    private static final QName _TgtdTCOl_QNAME = new QName("", "ol");
    private static final QName _TgtdTCUl_QNAME = new QName("", "ul");
    private static final QName _TgtdTCTextComplement_QNAME = new QName("", "TextComplement");
    private static final QName _TgpTCImage_QNAME = new QName("", "image");
    private static final QName _TgFTextPage_QNAME = new QName("", "page");
    private static final QName _TgFTextImage_QNAME = new QName("", "Image");
    private static final QName _TgBoQTextText_QNAME = new QName("", "Text");
    private static final QName _TgBoQTextAttachment_QNAME = new QName("", "attachment");
    private static final QName _TgItemALNGroupNo_QNAME = new QName("", "ALNGroupNo");
    private static final QName _TgItemALNSerNo_QNAME = new QName("", "ALNSerNo");
    private static final QName _TgItemAccepted_QNAME = new QName("", "Accepted");
    private static final QName _TgItemProvis_QNAME = new QName("", "Provis");
    private static final QName _TgItemProvisAccpt_QNAME = new QName("", "ProvisAccpt");
    private static final QName _TgItemLumpSumItem_QNAME = new QName("", "LumpSumItem");
    private static final QName _TgItemNotAppl_QNAME = new QName("", "NotAppl");
    private static final QName _TgItemNotOffered_QNAME = new QName("", "NotOffered");
    private static final QName _TgItemHourIt_QNAME = new QName("", "HourIt");
    private static final QName _TgItemKeyIt_QNAME = new QName("", "KeyIt");
    private static final QName _TgItemUPBkdn_QNAME = new QName("", "UPBkdn");
    private static final QName _TgItemMarkupIt_QNAME = new QName("", "MarkupIt");
    private static final QName _TgItemCONo_QNAME = new QName("", "CONo");
    private static final QName _TgItemCOStatus_QNAME = new QName("", "COStatus");
    private static final QName _TgItemRefDescr_QNAME = new QName("", "RefDescr");
    private static final QName _TgItemRefRNo_QNAME = new QName("", "RefRNo");
    private static final QName _TgItemRefPerfNo_QNAME = new QName("", "RefPerfNo");
    private static final QName _TgItemHoldOutType_QNAME = new QName("", "HoldOutType");
    private static final QName _TgItemUseDur_QNAME = new QName("", "UseDur");
    private static final QName _TgItemUseDurLblTime_QNAME = new QName("", "UseDurLblTime");
    private static final QName _TgItemRefBaseItem_QNAME = new QName("", "RefBaseItem");
    private static final QName _TgItemQtyTBD_QNAME = new QName("", "QtyTBD");
    private static final QName _TgItemQty_QNAME = new QName("", "Qty");
    private static final QName _TgItemQtySplit_QNAME = new QName("", "QtySplit");
    private static final QName _TgItemPredQty_QNAME = new QName("", "PredQty");
    private static final QName _TgItemBillQty_QNAME = new QName("", "BillQty");
    private static final QName _TgItemQU_QNAME = new QName("", "QU");
    private static final QName _TgItemCtlgAssign_QNAME = new QName("", "CtlgAssign");
    private static final QName _TgItemUP_QNAME = new QName("", "UP");
    private static final QName _TgItemUP110_QNAME = new QName("", "UP110");
    private static final QName _TgItemUPComp1_QNAME = new QName("", "UPComp1");
    private static final QName _TgItemUPComp2_QNAME = new QName("", "UPComp2");
    private static final QName _TgItemUPComp3_QNAME = new QName("", "UPComp3");
    private static final QName _TgItemUPComp4_QNAME = new QName("", "UPComp4");
    private static final QName _TgItemUPComp5_QNAME = new QName("", "UPComp5");
    private static final QName _TgItemUPComp6_QNAME = new QName("", "UPComp6");
    private static final QName _TgItemDiscountPcnt_QNAME = new QName("", "DiscountPcnt");
    private static final QName _TgItemUPFrom_QNAME = new QName("", "UPFrom");
    private static final QName _TgItemUPAvg_QNAME = new QName("", "UPAvg");
    private static final QName _TgItemUPTo_QNAME = new QName("", "UPTo");
    private static final QName _TgItemUPWgFrom_QNAME = new QName("", "UPWgFrom");
    private static final QName _TgItemUPWgAvg_QNAME = new QName("", "UPWgAvg");
    private static final QName _TgItemUPWgTo_QNAME = new QName("", "UPWgTo");
    private static final QName _TgItemIT_QNAME = new QName("", "IT");
    private static final QName _TgItemVAT_QNAME = new QName("", "VAT");
    private static final QName _TgItemPriceInfo_QNAME = new QName("", "PriceInfo");
    private static final QName _TgItemTimeQu_QNAME = new QName("", "TimeQu");
    private static final QName _TgItemDescription_QNAME = new QName("", "Description");
    private static final QName _TgItemBidComm_QNAME = new QName("", "BidComm");
    private static final QName _TgItemSumDescr_QNAME = new QName("", "SumDescr");
    private static final QName _TgItemSubDescr_QNAME = new QName("", "SubDescr");
    private static final QName _TgItemProduct_QNAME = new QName("", "Product");
    private static final QName _TgItemAlterBidStatus_QNAME = new QName("", "AlterBidStatus");
    private static final QName _TgItemCostApproach_QNAME = new QName("", "CostApproach");
    private static final QName _TgItemCheckNote_QNAME = new QName("", "CheckNote");
    private static final QName _TgItemQtyDeterm_QNAME = new QName("", "QtyDeterm");
    private static final QName _TgItemBidUpDownReq_QNAME = new QName("", "BidUpDownReq");
    private static final QName _TgItemBidUpDownPct_QNAME = new QName("", "BidUpDownPct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.gaebviewer.schema.da80
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TgQDetermItem2 }
     * 
     * @return
     *     the new instance of {@link TgQDetermItem2 }
     */
    public TgQDetermItem2 createTgQDetermItem2() {
        return new TgQDetermItem2();
    }

    /**
     * Create an instance of {@link TgRefItems2 }
     * 
     * @return
     *     the new instance of {@link TgRefItems2 }
     */
    public TgRefItems2 createTgRefItems2() {
        return new TgRefItems2();
    }

    /**
     * Create an instance of {@link TgQuotation2 }
     * 
     * @return
     *     the new instance of {@link TgQuotation2 }
     */
    public TgQuotation2 createTgQuotation2() {
        return new TgQuotation2();
    }

    /**
     * Create an instance of {@link TgPriceModification2 }
     * 
     * @return
     *     the new instance of {@link TgPriceModification2 }
     */
    public TgPriceModification2 createTgPriceModification2() {
        return new TgPriceModification2();
    }

    /**
     * Create an instance of {@link TgCashDiscount2 }
     * 
     * @return
     *     the new instance of {@link TgCashDiscount2 }
     */
    public TgCashDiscount2 createTgCashDiscount2() {
        return new TgCashDiscount2();
    }

    /**
     * Create an instance of {@link TgQDetermItem }
     * 
     * @return
     *     the new instance of {@link TgQDetermItem }
     */
    public TgQDetermItem createTgQDetermItem() {
        return new TgQDetermItem();
    }

    /**
     * Create an instance of {@link TgRefItems }
     * 
     * @return
     *     the new instance of {@link TgRefItems }
     */
    public TgRefItems createTgRefItems() {
        return new TgRefItems();
    }

    /**
     * Create an instance of {@link TgQuotation }
     * 
     * @return
     *     the new instance of {@link TgQuotation }
     */
    public TgQuotation createTgQuotation() {
        return new TgQuotation();
    }

    /**
     * Create an instance of {@link TgPriceModification }
     * 
     * @return
     *     the new instance of {@link TgPriceModification }
     */
    public TgPriceModification createTgPriceModification() {
        return new TgPriceModification();
    }

    /**
     * Create an instance of {@link TgCashDiscount }
     * 
     * @return
     *     the new instance of {@link TgCashDiscount }
     */
    public TgCashDiscount createTgCashDiscount() {
        return new TgCashDiscount();
    }

    /**
     * Create an instance of {@link TgGAEB }
     * 
     * @return
     *     the new instance of {@link TgGAEB }
     */
    public TgGAEB createTgGAEB() {
        return new TgGAEB();
    }

    /**
     * Create an instance of {@link TgGAEBInfo }
     * 
     * @return
     *     the new instance of {@link TgGAEBInfo }
     */
    public TgGAEBInfo createTgGAEBInfo() {
        return new TgGAEBInfo();
    }

    /**
     * Create an instance of {@link TgPrjInfo }
     * 
     * @return
     *     the new instance of {@link TgPrjInfo }
     */
    public TgPrjInfo createTgPrjInfo() {
        return new TgPrjInfo();
    }

    /**
     * Create an instance of {@link TgAward }
     * 
     * @return
     *     the new instance of {@link TgAward }
     */
    public TgAward createTgAward() {
        return new TgAward();
    }

    /**
     * Create an instance of {@link TgAwardInfo }
     * 
     * @return
     *     the new instance of {@link TgAwardInfo }
     */
    public TgAwardInfo createTgAwardInfo() {
        return new TgAwardInfo();
    }

    /**
     * Create an instance of {@link TgCOInfo }
     * 
     * @return
     *     the new instance of {@link TgCOInfo }
     */
    public TgCOInfo createTgCOInfo() {
        return new TgCOInfo();
    }

    /**
     * Create an instance of {@link TgMaintInfo }
     * 
     * @return
     *     the new instance of {@link TgMaintInfo }
     */
    public TgMaintInfo createTgMaintInfo() {
        return new TgMaintInfo();
    }

    /**
     * Create an instance of {@link TgMastAgrInfo }
     * 
     * @return
     *     the new instance of {@link TgMastAgrInfo }
     */
    public TgMastAgrInfo createTgMastAgrInfo() {
        return new TgMastAgrInfo();
    }

    /**
     * Create an instance of {@link TgContrValCode }
     * 
     * @return
     *     the new instance of {@link TgContrValCode }
     */
    public TgContrValCode createTgContrValCode() {
        return new TgContrValCode();
    }

    /**
     * Create an instance of {@link TgAddText }
     * 
     * @return
     *     the new instance of {@link TgAddText }
     */
    public TgAddText createTgAddText() {
        return new TgAddText();
    }

    /**
     * Create an instance of {@link TgOWN }
     * 
     * @return
     *     the new instance of {@link TgOWN }
     */
    public TgOWN createTgOWN() {
        return new TgOWN();
    }

    /**
     * Create an instance of {@link TgAddress }
     * 
     * @return
     *     the new instance of {@link TgAddress }
     */
    public TgAddress createTgAddress() {
        return new TgAddress();
    }

    /**
     * Create an instance of {@link TgBank }
     * 
     * @return
     *     the new instance of {@link TgBank }
     */
    public TgBank createTgBank() {
        return new TgBank();
    }

    /**
     * Create an instance of {@link TgCtlgAssign }
     * 
     * @return
     *     the new instance of {@link TgCtlgAssign }
     */
    public TgCtlgAssign createTgCtlgAssign() {
        return new TgCtlgAssign();
    }

    /**
     * Create an instance of {@link TgRequester }
     * 
     * @return
     *     the new instance of {@link TgRequester }
     */
    public TgRequester createTgRequester() {
        return new TgRequester();
    }

    /**
     * Create an instance of {@link TgCTR }
     * 
     * @return
     *     the new instance of {@link TgCTR }
     */
    public TgCTR createTgCTR() {
        return new TgCTR();
    }

    /**
     * Create an instance of {@link TgInsAs }
     * 
     * @return
     *     the new instance of {@link TgInsAs }
     */
    public TgInsAs createTgInsAs() {
        return new TgInsAs();
    }

    /**
     * Create an instance of {@link TgCnstSite }
     * 
     * @return
     *     the new instance of {@link TgCnstSite }
     */
    public TgCnstSite createTgCnstSite() {
        return new TgCnstSite();
    }

    /**
     * Create an instance of {@link TgNotifSite }
     * 
     * @return
     *     the new instance of {@link TgNotifSite }
     */
    public TgNotifSite createTgNotifSite() {
        return new TgNotifSite();
    }

    /**
     * Create an instance of {@link TgTotals }
     * 
     * @return
     *     the new instance of {@link TgTotals }
     */
    public TgTotals createTgTotals() {
        return new TgTotals();
    }

    /**
     * Create an instance of {@link TgVATPart }
     * 
     * @return
     *     the new instance of {@link TgVATPart }
     */
    public TgVATPart createTgVATPart() {
        return new TgVATPart();
    }

    /**
     * Create an instance of {@link TgTotalNetUpComp }
     * 
     * @return
     *     the new instance of {@link TgTotalNetUpComp }
     */
    public TgTotalNetUpComp createTgTotalNetUpComp() {
        return new TgTotalNetUpComp();
    }

    /**
     * Create an instance of {@link TgBoQBody }
     * 
     * @return
     *     the new instance of {@link TgBoQBody }
     */
    public TgBoQBody createTgBoQBody() {
        return new TgBoQBody();
    }

    /**
     * Create an instance of {@link TgItemlist }
     * 
     * @return
     *     the new instance of {@link TgItemlist }
     */
    public TgItemlist createTgItemlist() {
        return new TgItemlist();
    }

    /**
     * Create an instance of {@link TgBoQ }
     * 
     * @return
     *     the new instance of {@link TgBoQ }
     */
    public TgBoQ createTgBoQ() {
        return new TgBoQ();
    }

    /**
     * Create an instance of {@link TgBoQInfo }
     * 
     * @return
     *     the new instance of {@link TgBoQInfo }
     */
    public TgBoQInfo createTgBoQInfo() {
        return new TgBoQInfo();
    }

    /**
     * Create an instance of {@link TgBoQBkdn }
     * 
     * @return
     *     the new instance of {@link TgBoQBkdn }
     */
    public TgBoQBkdn createTgBoQBkdn() {
        return new TgBoQBkdn();
    }

    /**
     * Create an instance of {@link TgCPVCode }
     * 
     * @return
     *     the new instance of {@link TgCPVCode }
     */
    public TgCPVCode createTgCPVCode() {
        return new TgCPVCode();
    }

    /**
     * Create an instance of {@link TgCostType }
     * 
     * @return
     *     the new instance of {@link TgCostType }
     */
    public TgCostType createTgCostType() {
        return new TgCostType();
    }

    /**
     * Create an instance of {@link TgRemark }
     * 
     * @return
     *     the new instance of {@link TgRemark }
     */
    public TgRemark createTgRemark() {
        return new TgRemark();
    }

    /**
     * Create an instance of {@link TgDescription }
     * 
     * @return
     *     the new instance of {@link TgDescription }
     */
    public TgDescription createTgDescription() {
        return new TgDescription();
    }

    /**
     * Create an instance of {@link TgPerfDescription }
     * 
     * @return
     *     the new instance of {@link TgPerfDescription }
     */
    public TgPerfDescription createTgPerfDescription() {
        return new TgPerfDescription();
    }

    /**
     * Create an instance of {@link TgStLNo }
     * 
     * @return
     *     the new instance of {@link TgStLNo }
     */
    public TgStLNo createTgStLNo() {
        return new TgStLNo();
    }

    /**
     * Create an instance of {@link TgCompleteText }
     * 
     * @return
     *     the new instance of {@link TgCompleteText }
     */
    public TgCompleteText createTgCompleteText() {
        return new TgCompleteText();
    }

    /**
     * Create an instance of {@link TgSTLBBau }
     * 
     * @return
     *     the new instance of {@link TgSTLBBau }
     */
    public TgSTLBBau createTgSTLBBau() {
        return new TgSTLBBau();
    }

    /**
     * Create an instance of {@link TgSTLBBauCtlg }
     * 
     * @return
     *     the new instance of {@link TgSTLBBauCtlg }
     */
    public TgSTLBBauCtlg createTgSTLBBauCtlg() {
        return new TgSTLBBauCtlg();
    }

    /**
     * Create an instance of {@link TgSTLBBauID }
     * 
     * @return
     *     the new instance of {@link TgSTLBBauID }
     */
    public TgSTLBBauID createTgSTLBBauID() {
        return new TgSTLBBauID();
    }

    /**
     * Create an instance of {@link TgOutlTxt }
     * 
     * @return
     *     the new instance of {@link TgOutlTxt }
     */
    public TgOutlTxt createTgOutlTxt() {
        return new TgOutlTxt();
    }

    /**
     * Create an instance of {@link TgPerfDescr }
     * 
     * @return
     *     the new instance of {@link TgPerfDescr }
     */
    public TgPerfDescr createTgPerfDescr() {
        return new TgPerfDescr();
    }

    /**
     * Create an instance of {@link TgBoQCtgy }
     * 
     * @return
     *     the new instance of {@link TgBoQCtgy }
     */
    public TgBoQCtgy createTgBoQCtgy() {
        return new TgBoQCtgy();
    }

    /**
     * Create an instance of {@link TgItem }
     * 
     * @return
     *     the new instance of {@link TgItem }
     */
    public TgItem createTgItem() {
        return new TgItem();
    }

    /**
     * Create an instance of {@link TgQtySplit }
     * 
     * @return
     *     the new instance of {@link TgQtySplit }
     */
    public TgQtySplit createTgQtySplit() {
        return new TgQtySplit();
    }

    /**
     * Create an instance of {@link TgSubDescr }
     * 
     * @return
     *     the new instance of {@link TgSubDescr }
     */
    public TgSubDescr createTgSubDescr() {
        return new TgSubDescr();
    }

    /**
     * Create an instance of {@link TgProduct }
     * 
     * @return
     *     the new instance of {@link TgProduct }
     */
    public TgProduct createTgProduct() {
        return new TgProduct();
    }

    /**
     * Create an instance of {@link TgArticle }
     * 
     * @return
     *     the new instance of {@link TgArticle }
     */
    public TgArticle createTgArticle() {
        return new TgArticle();
    }

    /**
     * Create an instance of {@link TgCostApproach }
     * 
     * @return
     *     the new instance of {@link TgCostApproach }
     */
    public TgCostApproach createTgCostApproach() {
        return new TgCostApproach();
    }

    /**
     * Create an instance of {@link TgMarkupItem }
     * 
     * @return
     *     the new instance of {@link TgMarkupItem }
     */
    public TgMarkupItem createTgMarkupItem() {
        return new TgMarkupItem();
    }

    /**
     * Create an instance of {@link TgMarkupSubQty }
     * 
     * @return
     *     the new instance of {@link TgMarkupSubQty }
     */
    public TgMarkupSubQty createTgMarkupSubQty() {
        return new TgMarkupSubQty();
    }

    /**
     * Create an instance of {@link TgLotGrp }
     * 
     * @return
     *     the new instance of {@link TgLotGrp }
     */
    public TgLotGrp createTgLotGrp() {
        return new TgLotGrp();
    }

    /**
     * Create an instance of {@link TgWgChange }
     * 
     * @return
     *     the new instance of {@link TgWgChange }
     */
    public TgWgChange createTgWgChange() {
        return new TgWgChange();
    }

    /**
     * Create an instance of {@link TgBoQText }
     * 
     * @return
     *     the new instance of {@link TgBoQText }
     */
    public TgBoQText createTgBoQText() {
        return new TgBoQText();
    }

    /**
     * Create an instance of {@link TgTextComplement }
     * 
     * @return
     *     the new instance of {@link TgTextComplement }
     */
    public TgTextComplement createTgTextComplement() {
        return new TgTextComplement();
    }

    /**
     * Create an instance of {@link TgFTextTC }
     * 
     * @return
     *     the new instance of {@link TgFTextTC }
     */
    public TgFTextTC createTgFTextTC() {
        return new TgFTextTC();
    }

    /**
     * Create an instance of {@link TgFText }
     * 
     * @return
     *     the new instance of {@link TgFText }
     */
    public TgFText createTgFText() {
        return new TgFText();
    }

    /**
     * Create an instance of {@link TgMLText }
     * 
     * @return
     *     the new instance of {@link TgMLText }
     */
    public TgMLText createTgMLText() {
        return new TgMLText();
    }

    /**
     * Create an instance of {@link Tgp }
     * 
     * @return
     *     the new instance of {@link Tgp }
     */
    public Tgp createTgp() {
        return new Tgp();
    }

    /**
     * Create an instance of {@link TgpTC }
     * 
     * @return
     *     the new instance of {@link TgpTC }
     */
    public TgpTC createTgpTC() {
        return new TgpTC();
    }

    /**
     * Create an instance of {@link TgpMLText }
     * 
     * @return
     *     the new instance of {@link TgpMLText }
     */
    public TgpMLText createTgpMLText() {
        return new TgpMLText();
    }

    /**
     * Create an instance of {@link Tgspan }
     * 
     * @return
     *     the new instance of {@link Tgspan }
     */
    public Tgspan createTgspan() {
        return new Tgspan();
    }

    /**
     * Create an instance of {@link Tgdiv }
     * 
     * @return
     *     the new instance of {@link Tgdiv }
     */
    public Tgdiv createTgdiv() {
        return new Tgdiv();
    }

    /**
     * Create an instance of {@link TgdivTC }
     * 
     * @return
     *     the new instance of {@link TgdivTC }
     */
    public TgdivTC createTgdivTC() {
        return new TgdivTC();
    }

    /**
     * Create an instance of {@link Tgul }
     * 
     * @return
     *     the new instance of {@link Tgul }
     */
    public Tgul createTgul() {
        return new Tgul();
    }

    /**
     * Create an instance of {@link TgulTC }
     * 
     * @return
     *     the new instance of {@link TgulTC }
     */
    public TgulTC createTgulTC() {
        return new TgulTC();
    }

    /**
     * Create an instance of {@link Tgol }
     * 
     * @return
     *     the new instance of {@link Tgol }
     */
    public Tgol createTgol() {
        return new Tgol();
    }

    /**
     * Create an instance of {@link TgolTC }
     * 
     * @return
     *     the new instance of {@link TgolTC }
     */
    public TgolTC createTgolTC() {
        return new TgolTC();
    }

    /**
     * Create an instance of {@link Tgli }
     * 
     * @return
     *     the new instance of {@link Tgli }
     */
    public Tgli createTgli() {
        return new Tgli();
    }

    /**
     * Create an instance of {@link TgliTC }
     * 
     * @return
     *     the new instance of {@link TgliTC }
     */
    public TgliTC createTgliTC() {
        return new TgliTC();
    }

    /**
     * Create an instance of {@link Tgtable }
     * 
     * @return
     *     the new instance of {@link Tgtable }
     */
    public Tgtable createTgtable() {
        return new Tgtable();
    }

    /**
     * Create an instance of {@link TgtableTC }
     * 
     * @return
     *     the new instance of {@link TgtableTC }
     */
    public TgtableTC createTgtableTC() {
        return new TgtableTC();
    }

    /**
     * Create an instance of {@link Tgtr }
     * 
     * @return
     *     the new instance of {@link Tgtr }
     */
    public Tgtr createTgtr() {
        return new Tgtr();
    }

    /**
     * Create an instance of {@link TgtrTC }
     * 
     * @return
     *     the new instance of {@link TgtrTC }
     */
    public TgtrTC createTgtrTC() {
        return new TgtrTC();
    }

    /**
     * Create an instance of {@link Tgth }
     * 
     * @return
     *     the new instance of {@link Tgth }
     */
    public Tgth createTgth() {
        return new Tgth();
    }

    /**
     * Create an instance of {@link Tgtd }
     * 
     * @return
     *     the new instance of {@link Tgtd }
     */
    public Tgtd createTgtd() {
        return new Tgtd();
    }

    /**
     * Create an instance of {@link TgtdTC }
     * 
     * @return
     *     the new instance of {@link TgtdTC }
     */
    public TgtdTC createTgtdTC() {
        return new TgtdTC();
    }

    /**
     * Create an instance of {@link TgImage }
     * 
     * @return
     *     the new instance of {@link TgImage }
     */
    public TgImage createTgImage() {
        return new TgImage();
    }

    /**
     * Create an instance of {@link TgRefBoQCtgy }
     * 
     * @return
     *     the new instance of {@link TgRefBoQCtgy }
     */
    public TgRefBoQCtgy createTgRefBoQCtgy() {
        return new TgRefBoQCtgy();
    }

    /**
     * Create an instance of {@link TgRefLotGrp }
     * 
     * @return
     *     the new instance of {@link TgRefLotGrp }
     */
    public TgRefLotGrp createTgRefLotGrp() {
        return new TgRefLotGrp();
    }

    /**
     * Create an instance of {@link TgRefBoQ }
     * 
     * @return
     *     the new instance of {@link TgRefBoQ }
     */
    public TgRefBoQ createTgRefBoQ() {
        return new TgRefBoQ();
    }

    /**
     * Create an instance of {@link TgOutlineText }
     * 
     * @return
     *     the new instance of {@link TgOutlineText }
     */
    public TgOutlineText createTgOutlineText() {
        return new TgOutlineText();
    }

    /**
     * Create an instance of {@link TgCtlg }
     * 
     * @return
     *     the new instance of {@link TgCtlg }
     */
    public TgCtlg createTgCtlg() {
        return new TgCtlg();
    }

    /**
     * Create an instance of {@link TgQtyDetermInfo }
     * 
     * @return
     *     the new instance of {@link TgQtyDetermInfo }
     */
    public TgQtyDetermInfo createTgQtyDetermInfo() {
        return new TgQtyDetermInfo();
    }

    /**
     * Create an instance of {@link TgStyle }
     * 
     * @return
     *     the new instance of {@link TgStyle }
     */
    public TgStyle createTgStyle() {
        return new TgStyle();
    }

    /**
     * Create an instance of {@link TgRefItem }
     * 
     * @return
     *     the new instance of {@link TgRefItem }
     */
    public TgRefItem createTgRefItem() {
        return new TgRefItem();
    }

    /**
     * Create an instance of {@link TgCashDiscDays }
     * 
     * @return
     *     the new instance of {@link TgCashDiscDays }
     */
    public TgCashDiscDays createTgCashDiscDays() {
        return new TgCashDiscDays();
    }

    /**
     * Create an instance of {@link TgComplBodyDec }
     * 
     * @return
     *     the new instance of {@link TgComplBodyDec }
     */
    public TgComplBodyDec createTgComplBodyDec() {
        return new TgComplBodyDec();
    }

    /**
     * Create an instance of {@link TgComplBodyInt }
     * 
     * @return
     *     the new instance of {@link TgComplBodyInt }
     */
    public TgComplBodyInt createTgComplBodyInt() {
        return new TgComplBodyInt();
    }

    /**
     * Create an instance of {@link TgLblUpComp }
     * 
     * @return
     *     the new instance of {@link TgLblUpComp }
     */
    public TgLblUpComp createTgLblUpComp() {
        return new TgLblUpComp();
    }

    /**
     * Create an instance of {@link TgISOCur }
     * 
     * @return
     *     the new instance of {@link TgISOCur }
     */
    public TgISOCur createTgISOCur() {
        return new TgISOCur();
    }

    /**
     * Create an instance of {@link TgOrder }
     * 
     * @return
     *     the new instance of {@link TgOrder }
     */
    public TgOrder createTgOrder() {
        return new TgOrder();
    }

    /**
     * Create an instance of {@link TgOrderInfo }
     * 
     * @return
     *     the new instance of {@link TgOrderInfo }
     */
    public TgOrderInfo createTgOrderInfo() {
        return new TgOrderInfo();
    }

    /**
     * Create an instance of {@link TgSupplierInfo }
     * 
     * @return
     *     the new instance of {@link TgSupplierInfo }
     */
    public TgSupplierInfo createTgSupplierInfo() {
        return new TgSupplierInfo();
    }

    /**
     * Create an instance of {@link TgCustomerInfo }
     * 
     * @return
     *     the new instance of {@link TgCustomerInfo }
     */
    public TgCustomerInfo createTgCustomerInfo() {
        return new TgCustomerInfo();
    }

    /**
     * Create an instance of {@link TgDeliveryPlaceInfo }
     * 
     * @return
     *     the new instance of {@link TgDeliveryPlaceInfo }
     */
    public TgDeliveryPlaceInfo createTgDeliveryPlaceInfo() {
        return new TgDeliveryPlaceInfo();
    }

    /**
     * Create an instance of {@link TgPlannerInfo }
     * 
     * @return
     *     the new instance of {@link TgPlannerInfo }
     */
    public TgPlannerInfo createTgPlannerInfo() {
        return new TgPlannerInfo();
    }

    /**
     * Create an instance of {@link TgInvoiceInfo }
     * 
     * @return
     *     the new instance of {@link TgInvoiceInfo }
     */
    public TgInvoiceInfo createTgInvoiceInfo() {
        return new TgInvoiceInfo();
    }

    /**
     * Create an instance of {@link TgOrderTotals }
     * 
     * @return
     *     the new instance of {@link TgOrderTotals }
     */
    public TgOrderTotals createTgOrderTotals() {
        return new TgOrderTotals();
    }

    /**
     * Create an instance of {@link TgWeightPart }
     * 
     * @return
     *     the new instance of {@link TgWeightPart }
     */
    public TgWeightPart createTgWeightPart() {
        return new TgWeightPart();
    }

    /**
     * Create an instance of {@link TgUserValue }
     * 
     * @return
     *     the new instance of {@link TgUserValue }
     */
    public TgUserValue createTgUserValue() {
        return new TgUserValue();
    }

    /**
     * Create an instance of {@link TgDimension }
     * 
     * @return
     *     the new instance of {@link TgDimension }
     */
    public TgDimension createTgDimension() {
        return new TgDimension();
    }

    /**
     * Create an instance of {@link TgOrderItem }
     * 
     * @return
     *     the new instance of {@link TgOrderItem }
     */
    public TgOrderItem createTgOrderItem() {
        return new TgOrderItem();
    }

    /**
     * Create an instance of {@link TgMetalResources }
     * 
     * @return
     *     the new instance of {@link TgMetalResources }
     */
    public TgMetalResources createTgMetalResources() {
        return new TgMetalResources();
    }

    /**
     * Create an instance of {@link TgCheckNote }
     * 
     * @return
     *     the new instance of {@link TgCheckNote }
     */
    public TgCheckNote createTgCheckNote() {
        return new TgCheckNote();
    }

    /**
     * Create an instance of {@link TgPaymentMade }
     * 
     * @return
     *     the new instance of {@link TgPaymentMade }
     */
    public TgPaymentMade createTgPaymentMade() {
        return new TgPaymentMade();
    }

    /**
     * Create an instance of {@link TgInvoiceMadeOut }
     * 
     * @return
     *     the new instance of {@link TgInvoiceMadeOut }
     */
    public TgInvoiceMadeOut createTgInvoiceMadeOut() {
        return new TgInvoiceMadeOut();
    }

    /**
     * Create an instance of {@link TgInvoiceHeader }
     * 
     * @return
     *     the new instance of {@link TgInvoiceHeader }
     */
    public TgInvoiceHeader createTgInvoiceHeader() {
        return new TgInvoiceHeader();
    }

    /**
     * Create an instance of {@link TgInvoiceCreator }
     * 
     * @return
     *     the new instance of {@link TgInvoiceCreator }
     */
    public TgInvoiceCreator createTgInvoiceCreator() {
        return new TgInvoiceCreator();
    }

    /**
     * Create an instance of {@link TgInvoiceRecipient }
     * 
     * @return
     *     the new instance of {@link TgInvoiceRecipient }
     */
    public TgInvoiceRecipient createTgInvoiceRecipient() {
        return new TgInvoiceRecipient();
    }

    /**
     * Create an instance of {@link TgInvoiceShare }
     * 
     * @return
     *     the new instance of {@link TgInvoiceShare }
     */
    public TgInvoiceShare createTgInvoiceShare() {
        return new TgInvoiceShare();
    }

    /**
     * Create an instance of {@link TgInvoice }
     * 
     * @return
     *     the new instance of {@link TgInvoice }
     */
    public TgInvoice createTgInvoice() {
        return new TgInvoice();
    }

    /**
     * Create an instance of {@link TgQtyDeterm }
     * 
     * @return
     *     the new instance of {@link TgQtyDeterm }
     */
    public TgQtyDeterm createTgQtyDeterm() {
        return new TgQtyDeterm();
    }

    /**
     * Create an instance of {@link TgIndivAgrInfo }
     * 
     * @return
     *     the new instance of {@link TgIndivAgrInfo }
     */
    public TgIndivAgrInfo createTgIndivAgrInfo() {
        return new TgIndivAgrInfo();
    }

    /**
     * Create an instance of {@link TgMastAgrItems }
     * 
     * @return
     *     the new instance of {@link TgMastAgrItems }
     */
    public TgMastAgrItems createTgMastAgrItems() {
        return new TgMastAgrItems();
    }

    /**
     * Create an instance of {@link TgHourItem }
     * 
     * @return
     *     the new instance of {@link TgHourItem }
     */
    public TgHourItem createTgHourItem() {
        return new TgHourItem();
    }

    /**
     * Create an instance of {@link TgMaterialItem }
     * 
     * @return
     *     the new instance of {@link TgMaterialItem }
     */
    public TgMaterialItem createTgMaterialItem() {
        return new TgMaterialItem();
    }

    /**
     * Create an instance of {@link TgMarkupItemOWN }
     * 
     * @return
     *     the new instance of {@link TgMarkupItemOWN }
     */
    public TgMarkupItemOWN createTgMarkupItemOWN() {
        return new TgMarkupItemOWN();
    }

    /**
     * Create an instance of {@link TgMarkupItemCTR }
     * 
     * @return
     *     the new instance of {@link TgMarkupItemCTR }
     */
    public TgMarkupItemCTR createTgMarkupItemCTR() {
        return new TgMarkupItemCTR();
    }

    /**
     * Create an instance of {@link TgCtlgAssignQuantity }
     * 
     * @return
     *     the new instance of {@link TgCtlgAssignQuantity }
     */
    public TgCtlgAssignQuantity createTgCtlgAssignQuantity() {
        return new TgCtlgAssignQuantity();
    }

    /**
     * Create an instance of {@link TgGAEB2 }
     * 
     * @return
     *     the new instance of {@link TgGAEB2 }
     */
    public TgGAEB2 createTgGAEB2() {
        return new TgGAEB2();
    }

    /**
     * Create an instance of {@link TgGAEBInfo2 }
     * 
     * @return
     *     the new instance of {@link TgGAEBInfo2 }
     */
    public TgGAEBInfo2 createTgGAEBInfo2() {
        return new TgGAEBInfo2();
    }

    /**
     * Create an instance of {@link TgPrjInfo2 }
     * 
     * @return
     *     the new instance of {@link TgPrjInfo2 }
     */
    public TgPrjInfo2 createTgPrjInfo2() {
        return new TgPrjInfo2();
    }

    /**
     * Create an instance of {@link TgAward2 }
     * 
     * @return
     *     the new instance of {@link TgAward2 }
     */
    public TgAward2 createTgAward2() {
        return new TgAward2();
    }

    /**
     * Create an instance of {@link TgAwardInfo2 }
     * 
     * @return
     *     the new instance of {@link TgAwardInfo2 }
     */
    public TgAwardInfo2 createTgAwardInfo2() {
        return new TgAwardInfo2();
    }

    /**
     * Create an instance of {@link TgCOInfo2 }
     * 
     * @return
     *     the new instance of {@link TgCOInfo2 }
     */
    public TgCOInfo2 createTgCOInfo2() {
        return new TgCOInfo2();
    }

    /**
     * Create an instance of {@link TgMaintInfo2 }
     * 
     * @return
     *     the new instance of {@link TgMaintInfo2 }
     */
    public TgMaintInfo2 createTgMaintInfo2() {
        return new TgMaintInfo2();
    }

    /**
     * Create an instance of {@link TgMastAgrInfo2 }
     * 
     * @return
     *     the new instance of {@link TgMastAgrInfo2 }
     */
    public TgMastAgrInfo2 createTgMastAgrInfo2() {
        return new TgMastAgrInfo2();
    }

    /**
     * Create an instance of {@link TgContrValCode2 }
     * 
     * @return
     *     the new instance of {@link TgContrValCode2 }
     */
    public TgContrValCode2 createTgContrValCode2() {
        return new TgContrValCode2();
    }

    /**
     * Create an instance of {@link TgAddText2 }
     * 
     * @return
     *     the new instance of {@link TgAddText2 }
     */
    public TgAddText2 createTgAddText2() {
        return new TgAddText2();
    }

    /**
     * Create an instance of {@link TgOWN2 }
     * 
     * @return
     *     the new instance of {@link TgOWN2 }
     */
    public TgOWN2 createTgOWN2() {
        return new TgOWN2();
    }

    /**
     * Create an instance of {@link TgAddress2 }
     * 
     * @return
     *     the new instance of {@link TgAddress2 }
     */
    public TgAddress2 createTgAddress2() {
        return new TgAddress2();
    }

    /**
     * Create an instance of {@link TgBank2 }
     * 
     * @return
     *     the new instance of {@link TgBank2 }
     */
    public TgBank2 createTgBank2() {
        return new TgBank2();
    }

    /**
     * Create an instance of {@link TgCtlgAssign2 }
     * 
     * @return
     *     the new instance of {@link TgCtlgAssign2 }
     */
    public TgCtlgAssign2 createTgCtlgAssign2() {
        return new TgCtlgAssign2();
    }

    /**
     * Create an instance of {@link TgRequester2 }
     * 
     * @return
     *     the new instance of {@link TgRequester2 }
     */
    public TgRequester2 createTgRequester2() {
        return new TgRequester2();
    }

    /**
     * Create an instance of {@link TgCTR2 }
     * 
     * @return
     *     the new instance of {@link TgCTR2 }
     */
    public TgCTR2 createTgCTR2() {
        return new TgCTR2();
    }

    /**
     * Create an instance of {@link TgInsAs2 }
     * 
     * @return
     *     the new instance of {@link TgInsAs2 }
     */
    public TgInsAs2 createTgInsAs2() {
        return new TgInsAs2();
    }

    /**
     * Create an instance of {@link TgCnstSite2 }
     * 
     * @return
     *     the new instance of {@link TgCnstSite2 }
     */
    public TgCnstSite2 createTgCnstSite2() {
        return new TgCnstSite2();
    }

    /**
     * Create an instance of {@link TgNotifSite2 }
     * 
     * @return
     *     the new instance of {@link TgNotifSite2 }
     */
    public TgNotifSite2 createTgNotifSite2() {
        return new TgNotifSite2();
    }

    /**
     * Create an instance of {@link TgTotals2 }
     * 
     * @return
     *     the new instance of {@link TgTotals2 }
     */
    public TgTotals2 createTgTotals2() {
        return new TgTotals2();
    }

    /**
     * Create an instance of {@link TgVATPart2 }
     * 
     * @return
     *     the new instance of {@link TgVATPart2 }
     */
    public TgVATPart2 createTgVATPart2() {
        return new TgVATPart2();
    }

    /**
     * Create an instance of {@link TgTotalNetUpComp2 }
     * 
     * @return
     *     the new instance of {@link TgTotalNetUpComp2 }
     */
    public TgTotalNetUpComp2 createTgTotalNetUpComp2() {
        return new TgTotalNetUpComp2();
    }

    /**
     * Create an instance of {@link TgBoQBody2 }
     * 
     * @return
     *     the new instance of {@link TgBoQBody2 }
     */
    public TgBoQBody2 createTgBoQBody2() {
        return new TgBoQBody2();
    }

    /**
     * Create an instance of {@link TgItemlist2 }
     * 
     * @return
     *     the new instance of {@link TgItemlist2 }
     */
    public TgItemlist2 createTgItemlist2() {
        return new TgItemlist2();
    }

    /**
     * Create an instance of {@link TgBoQ2 }
     * 
     * @return
     *     the new instance of {@link TgBoQ2 }
     */
    public TgBoQ2 createTgBoQ2() {
        return new TgBoQ2();
    }

    /**
     * Create an instance of {@link TgBoQInfo2 }
     * 
     * @return
     *     the new instance of {@link TgBoQInfo2 }
     */
    public TgBoQInfo2 createTgBoQInfo2() {
        return new TgBoQInfo2();
    }

    /**
     * Create an instance of {@link TgBoQBkdn2 }
     * 
     * @return
     *     the new instance of {@link TgBoQBkdn2 }
     */
    public TgBoQBkdn2 createTgBoQBkdn2() {
        return new TgBoQBkdn2();
    }

    /**
     * Create an instance of {@link TgCPVCode2 }
     * 
     * @return
     *     the new instance of {@link TgCPVCode2 }
     */
    public TgCPVCode2 createTgCPVCode2() {
        return new TgCPVCode2();
    }

    /**
     * Create an instance of {@link TgCostType2 }
     * 
     * @return
     *     the new instance of {@link TgCostType2 }
     */
    public TgCostType2 createTgCostType2() {
        return new TgCostType2();
    }

    /**
     * Create an instance of {@link TgRemark2 }
     * 
     * @return
     *     the new instance of {@link TgRemark2 }
     */
    public TgRemark2 createTgRemark2() {
        return new TgRemark2();
    }

    /**
     * Create an instance of {@link TgDescription2 }
     * 
     * @return
     *     the new instance of {@link TgDescription2 }
     */
    public TgDescription2 createTgDescription2() {
        return new TgDescription2();
    }

    /**
     * Create an instance of {@link TgPerfDescription2 }
     * 
     * @return
     *     the new instance of {@link TgPerfDescription2 }
     */
    public TgPerfDescription2 createTgPerfDescription2() {
        return new TgPerfDescription2();
    }

    /**
     * Create an instance of {@link TgStLNo2 }
     * 
     * @return
     *     the new instance of {@link TgStLNo2 }
     */
    public TgStLNo2 createTgStLNo2() {
        return new TgStLNo2();
    }

    /**
     * Create an instance of {@link TgCompleteText2 }
     * 
     * @return
     *     the new instance of {@link TgCompleteText2 }
     */
    public TgCompleteText2 createTgCompleteText2() {
        return new TgCompleteText2();
    }

    /**
     * Create an instance of {@link TgSTLBBau2 }
     * 
     * @return
     *     the new instance of {@link TgSTLBBau2 }
     */
    public TgSTLBBau2 createTgSTLBBau2() {
        return new TgSTLBBau2();
    }

    /**
     * Create an instance of {@link TgSTLBBauCtlg2 }
     * 
     * @return
     *     the new instance of {@link TgSTLBBauCtlg2 }
     */
    public TgSTLBBauCtlg2 createTgSTLBBauCtlg2() {
        return new TgSTLBBauCtlg2();
    }

    /**
     * Create an instance of {@link TgSTLBBauID2 }
     * 
     * @return
     *     the new instance of {@link TgSTLBBauID2 }
     */
    public TgSTLBBauID2 createTgSTLBBauID2() {
        return new TgSTLBBauID2();
    }

    /**
     * Create an instance of {@link TgOutlTxt2 }
     * 
     * @return
     *     the new instance of {@link TgOutlTxt2 }
     */
    public TgOutlTxt2 createTgOutlTxt2() {
        return new TgOutlTxt2();
    }

    /**
     * Create an instance of {@link TgPerfDescr2 }
     * 
     * @return
     *     the new instance of {@link TgPerfDescr2 }
     */
    public TgPerfDescr2 createTgPerfDescr2() {
        return new TgPerfDescr2();
    }

    /**
     * Create an instance of {@link TgBoQCtgy2 }
     * 
     * @return
     *     the new instance of {@link TgBoQCtgy2 }
     */
    public TgBoQCtgy2 createTgBoQCtgy2() {
        return new TgBoQCtgy2();
    }

    /**
     * Create an instance of {@link TgItem2 }
     * 
     * @return
     *     the new instance of {@link TgItem2 }
     */
    public TgItem2 createTgItem2() {
        return new TgItem2();
    }

    /**
     * Create an instance of {@link TgQtySplit2 }
     * 
     * @return
     *     the new instance of {@link TgQtySplit2 }
     */
    public TgQtySplit2 createTgQtySplit2() {
        return new TgQtySplit2();
    }

    /**
     * Create an instance of {@link TgSubDescr2 }
     * 
     * @return
     *     the new instance of {@link TgSubDescr2 }
     */
    public TgSubDescr2 createTgSubDescr2() {
        return new TgSubDescr2();
    }

    /**
     * Create an instance of {@link TgProduct2 }
     * 
     * @return
     *     the new instance of {@link TgProduct2 }
     */
    public TgProduct2 createTgProduct2() {
        return new TgProduct2();
    }

    /**
     * Create an instance of {@link TgArticle2 }
     * 
     * @return
     *     the new instance of {@link TgArticle2 }
     */
    public TgArticle2 createTgArticle2() {
        return new TgArticle2();
    }

    /**
     * Create an instance of {@link TgCostApproach2 }
     * 
     * @return
     *     the new instance of {@link TgCostApproach2 }
     */
    public TgCostApproach2 createTgCostApproach2() {
        return new TgCostApproach2();
    }

    /**
     * Create an instance of {@link TgMarkupItem2 }
     * 
     * @return
     *     the new instance of {@link TgMarkupItem2 }
     */
    public TgMarkupItem2 createTgMarkupItem2() {
        return new TgMarkupItem2();
    }

    /**
     * Create an instance of {@link TgMarkupSubQty2 }
     * 
     * @return
     *     the new instance of {@link TgMarkupSubQty2 }
     */
    public TgMarkupSubQty2 createTgMarkupSubQty2() {
        return new TgMarkupSubQty2();
    }

    /**
     * Create an instance of {@link TgLotGrp2 }
     * 
     * @return
     *     the new instance of {@link TgLotGrp2 }
     */
    public TgLotGrp2 createTgLotGrp2() {
        return new TgLotGrp2();
    }

    /**
     * Create an instance of {@link TgWgChange2 }
     * 
     * @return
     *     the new instance of {@link TgWgChange2 }
     */
    public TgWgChange2 createTgWgChange2() {
        return new TgWgChange2();
    }

    /**
     * Create an instance of {@link TgBoQText2 }
     * 
     * @return
     *     the new instance of {@link TgBoQText2 }
     */
    public TgBoQText2 createTgBoQText2() {
        return new TgBoQText2();
    }

    /**
     * Create an instance of {@link TgTextComplement2 }
     * 
     * @return
     *     the new instance of {@link TgTextComplement2 }
     */
    public TgTextComplement2 createTgTextComplement2() {
        return new TgTextComplement2();
    }

    /**
     * Create an instance of {@link TgFTextTC2 }
     * 
     * @return
     *     the new instance of {@link TgFTextTC2 }
     */
    public TgFTextTC2 createTgFTextTC2() {
        return new TgFTextTC2();
    }

    /**
     * Create an instance of {@link TgFText2 }
     * 
     * @return
     *     the new instance of {@link TgFText2 }
     */
    public TgFText2 createTgFText2() {
        return new TgFText2();
    }

    /**
     * Create an instance of {@link TgMLText2 }
     * 
     * @return
     *     the new instance of {@link TgMLText2 }
     */
    public TgMLText2 createTgMLText2() {
        return new TgMLText2();
    }

    /**
     * Create an instance of {@link Tgp2 }
     * 
     * @return
     *     the new instance of {@link Tgp2 }
     */
    public Tgp2 createTgp2() {
        return new Tgp2();
    }

    /**
     * Create an instance of {@link TgpTC2 }
     * 
     * @return
     *     the new instance of {@link TgpTC2 }
     */
    public TgpTC2 createTgpTC2() {
        return new TgpTC2();
    }

    /**
     * Create an instance of {@link TgpMLText2 }
     * 
     * @return
     *     the new instance of {@link TgpMLText2 }
     */
    public TgpMLText2 createTgpMLText2() {
        return new TgpMLText2();
    }

    /**
     * Create an instance of {@link Tgspan2 }
     * 
     * @return
     *     the new instance of {@link Tgspan2 }
     */
    public Tgspan2 createTgspan2() {
        return new Tgspan2();
    }

    /**
     * Create an instance of {@link Tgdiv2 }
     * 
     * @return
     *     the new instance of {@link Tgdiv2 }
     */
    public Tgdiv2 createTgdiv2() {
        return new Tgdiv2();
    }

    /**
     * Create an instance of {@link TgdivTC2 }
     * 
     * @return
     *     the new instance of {@link TgdivTC2 }
     */
    public TgdivTC2 createTgdivTC2() {
        return new TgdivTC2();
    }

    /**
     * Create an instance of {@link Tgul2 }
     * 
     * @return
     *     the new instance of {@link Tgul2 }
     */
    public Tgul2 createTgul2() {
        return new Tgul2();
    }

    /**
     * Create an instance of {@link TgulTC2 }
     * 
     * @return
     *     the new instance of {@link TgulTC2 }
     */
    public TgulTC2 createTgulTC2() {
        return new TgulTC2();
    }

    /**
     * Create an instance of {@link Tgol2 }
     * 
     * @return
     *     the new instance of {@link Tgol2 }
     */
    public Tgol2 createTgol2() {
        return new Tgol2();
    }

    /**
     * Create an instance of {@link TgolTC2 }
     * 
     * @return
     *     the new instance of {@link TgolTC2 }
     */
    public TgolTC2 createTgolTC2() {
        return new TgolTC2();
    }

    /**
     * Create an instance of {@link Tgli2 }
     * 
     * @return
     *     the new instance of {@link Tgli2 }
     */
    public Tgli2 createTgli2() {
        return new Tgli2();
    }

    /**
     * Create an instance of {@link TgliTC2 }
     * 
     * @return
     *     the new instance of {@link TgliTC2 }
     */
    public TgliTC2 createTgliTC2() {
        return new TgliTC2();
    }

    /**
     * Create an instance of {@link Tgtable2 }
     * 
     * @return
     *     the new instance of {@link Tgtable2 }
     */
    public Tgtable2 createTgtable2() {
        return new Tgtable2();
    }

    /**
     * Create an instance of {@link TgtableTC2 }
     * 
     * @return
     *     the new instance of {@link TgtableTC2 }
     */
    public TgtableTC2 createTgtableTC2() {
        return new TgtableTC2();
    }

    /**
     * Create an instance of {@link Tgtr2 }
     * 
     * @return
     *     the new instance of {@link Tgtr2 }
     */
    public Tgtr2 createTgtr2() {
        return new Tgtr2();
    }

    /**
     * Create an instance of {@link TgtrTC2 }
     * 
     * @return
     *     the new instance of {@link TgtrTC2 }
     */
    public TgtrTC2 createTgtrTC2() {
        return new TgtrTC2();
    }

    /**
     * Create an instance of {@link Tgth2 }
     * 
     * @return
     *     the new instance of {@link Tgth2 }
     */
    public Tgth2 createTgth2() {
        return new Tgth2();
    }

    /**
     * Create an instance of {@link Tgtd2 }
     * 
     * @return
     *     the new instance of {@link Tgtd2 }
     */
    public Tgtd2 createTgtd2() {
        return new Tgtd2();
    }

    /**
     * Create an instance of {@link TgtdTC2 }
     * 
     * @return
     *     the new instance of {@link TgtdTC2 }
     */
    public TgtdTC2 createTgtdTC2() {
        return new TgtdTC2();
    }

    /**
     * Create an instance of {@link TgImage2 }
     * 
     * @return
     *     the new instance of {@link TgImage2 }
     */
    public TgImage2 createTgImage2() {
        return new TgImage2();
    }

    /**
     * Create an instance of {@link TgRefBoQCtgy2 }
     * 
     * @return
     *     the new instance of {@link TgRefBoQCtgy2 }
     */
    public TgRefBoQCtgy2 createTgRefBoQCtgy2() {
        return new TgRefBoQCtgy2();
    }

    /**
     * Create an instance of {@link TgRefLotGrp2 }
     * 
     * @return
     *     the new instance of {@link TgRefLotGrp2 }
     */
    public TgRefLotGrp2 createTgRefLotGrp2() {
        return new TgRefLotGrp2();
    }

    /**
     * Create an instance of {@link TgRefBoQ2 }
     * 
     * @return
     *     the new instance of {@link TgRefBoQ2 }
     */
    public TgRefBoQ2 createTgRefBoQ2() {
        return new TgRefBoQ2();
    }

    /**
     * Create an instance of {@link TgOutlineText2 }
     * 
     * @return
     *     the new instance of {@link TgOutlineText2 }
     */
    public TgOutlineText2 createTgOutlineText2() {
        return new TgOutlineText2();
    }

    /**
     * Create an instance of {@link TgCtlg2 }
     * 
     * @return
     *     the new instance of {@link TgCtlg2 }
     */
    public TgCtlg2 createTgCtlg2() {
        return new TgCtlg2();
    }

    /**
     * Create an instance of {@link TgQtyDetermInfo2 }
     * 
     * @return
     *     the new instance of {@link TgQtyDetermInfo2 }
     */
    public TgQtyDetermInfo2 createTgQtyDetermInfo2() {
        return new TgQtyDetermInfo2();
    }

    /**
     * Create an instance of {@link TgStyle2 }
     * 
     * @return
     *     the new instance of {@link TgStyle2 }
     */
    public TgStyle2 createTgStyle2() {
        return new TgStyle2();
    }

    /**
     * Create an instance of {@link TgRefItem2 }
     * 
     * @return
     *     the new instance of {@link TgRefItem2 }
     */
    public TgRefItem2 createTgRefItem2() {
        return new TgRefItem2();
    }

    /**
     * Create an instance of {@link TgCashDiscDays2 }
     * 
     * @return
     *     the new instance of {@link TgCashDiscDays2 }
     */
    public TgCashDiscDays2 createTgCashDiscDays2() {
        return new TgCashDiscDays2();
    }

    /**
     * Create an instance of {@link TgComplBodyDec2 }
     * 
     * @return
     *     the new instance of {@link TgComplBodyDec2 }
     */
    public TgComplBodyDec2 createTgComplBodyDec2() {
        return new TgComplBodyDec2();
    }

    /**
     * Create an instance of {@link TgComplBodyInt2 }
     * 
     * @return
     *     the new instance of {@link TgComplBodyInt2 }
     */
    public TgComplBodyInt2 createTgComplBodyInt2() {
        return new TgComplBodyInt2();
    }

    /**
     * Create an instance of {@link TgLblUpComp2 }
     * 
     * @return
     *     the new instance of {@link TgLblUpComp2 }
     */
    public TgLblUpComp2 createTgLblUpComp2() {
        return new TgLblUpComp2();
    }

    /**
     * Create an instance of {@link TgISOCur2 }
     * 
     * @return
     *     the new instance of {@link TgISOCur2 }
     */
    public TgISOCur2 createTgISOCur2() {
        return new TgISOCur2();
    }

    /**
     * Create an instance of {@link TgOrder2 }
     * 
     * @return
     *     the new instance of {@link TgOrder2 }
     */
    public TgOrder2 createTgOrder2() {
        return new TgOrder2();
    }

    /**
     * Create an instance of {@link TgOrderInfo2 }
     * 
     * @return
     *     the new instance of {@link TgOrderInfo2 }
     */
    public TgOrderInfo2 createTgOrderInfo2() {
        return new TgOrderInfo2();
    }

    /**
     * Create an instance of {@link TgSupplierInfo2 }
     * 
     * @return
     *     the new instance of {@link TgSupplierInfo2 }
     */
    public TgSupplierInfo2 createTgSupplierInfo2() {
        return new TgSupplierInfo2();
    }

    /**
     * Create an instance of {@link TgCustomerInfo2 }
     * 
     * @return
     *     the new instance of {@link TgCustomerInfo2 }
     */
    public TgCustomerInfo2 createTgCustomerInfo2() {
        return new TgCustomerInfo2();
    }

    /**
     * Create an instance of {@link TgDeliveryPlaceInfo2 }
     * 
     * @return
     *     the new instance of {@link TgDeliveryPlaceInfo2 }
     */
    public TgDeliveryPlaceInfo2 createTgDeliveryPlaceInfo2() {
        return new TgDeliveryPlaceInfo2();
    }

    /**
     * Create an instance of {@link TgPlannerInfo2 }
     * 
     * @return
     *     the new instance of {@link TgPlannerInfo2 }
     */
    public TgPlannerInfo2 createTgPlannerInfo2() {
        return new TgPlannerInfo2();
    }

    /**
     * Create an instance of {@link TgInvoiceInfo2 }
     * 
     * @return
     *     the new instance of {@link TgInvoiceInfo2 }
     */
    public TgInvoiceInfo2 createTgInvoiceInfo2() {
        return new TgInvoiceInfo2();
    }

    /**
     * Create an instance of {@link TgOrderTotals2 }
     * 
     * @return
     *     the new instance of {@link TgOrderTotals2 }
     */
    public TgOrderTotals2 createTgOrderTotals2() {
        return new TgOrderTotals2();
    }

    /**
     * Create an instance of {@link TgWeightPart2 }
     * 
     * @return
     *     the new instance of {@link TgWeightPart2 }
     */
    public TgWeightPart2 createTgWeightPart2() {
        return new TgWeightPart2();
    }

    /**
     * Create an instance of {@link TgUserValue2 }
     * 
     * @return
     *     the new instance of {@link TgUserValue2 }
     */
    public TgUserValue2 createTgUserValue2() {
        return new TgUserValue2();
    }

    /**
     * Create an instance of {@link TgDimension2 }
     * 
     * @return
     *     the new instance of {@link TgDimension2 }
     */
    public TgDimension2 createTgDimension2() {
        return new TgDimension2();
    }

    /**
     * Create an instance of {@link TgOrderItem2 }
     * 
     * @return
     *     the new instance of {@link TgOrderItem2 }
     */
    public TgOrderItem2 createTgOrderItem2() {
        return new TgOrderItem2();
    }

    /**
     * Create an instance of {@link TgMetalResources2 }
     * 
     * @return
     *     the new instance of {@link TgMetalResources2 }
     */
    public TgMetalResources2 createTgMetalResources2() {
        return new TgMetalResources2();
    }

    /**
     * Create an instance of {@link TgCheckNote2 }
     * 
     * @return
     *     the new instance of {@link TgCheckNote2 }
     */
    public TgCheckNote2 createTgCheckNote2() {
        return new TgCheckNote2();
    }

    /**
     * Create an instance of {@link TgPaymentMade2 }
     * 
     * @return
     *     the new instance of {@link TgPaymentMade2 }
     */
    public TgPaymentMade2 createTgPaymentMade2() {
        return new TgPaymentMade2();
    }

    /**
     * Create an instance of {@link TgInvoiceMadeOut2 }
     * 
     * @return
     *     the new instance of {@link TgInvoiceMadeOut2 }
     */
    public TgInvoiceMadeOut2 createTgInvoiceMadeOut2() {
        return new TgInvoiceMadeOut2();
    }

    /**
     * Create an instance of {@link TgInvoiceHeader2 }
     * 
     * @return
     *     the new instance of {@link TgInvoiceHeader2 }
     */
    public TgInvoiceHeader2 createTgInvoiceHeader2() {
        return new TgInvoiceHeader2();
    }

    /**
     * Create an instance of {@link TgInvoiceCreator2 }
     * 
     * @return
     *     the new instance of {@link TgInvoiceCreator2 }
     */
    public TgInvoiceCreator2 createTgInvoiceCreator2() {
        return new TgInvoiceCreator2();
    }

    /**
     * Create an instance of {@link TgInvoiceRecipient2 }
     * 
     * @return
     *     the new instance of {@link TgInvoiceRecipient2 }
     */
    public TgInvoiceRecipient2 createTgInvoiceRecipient2() {
        return new TgInvoiceRecipient2();
    }

    /**
     * Create an instance of {@link TgInvoiceShare2 }
     * 
     * @return
     *     the new instance of {@link TgInvoiceShare2 }
     */
    public TgInvoiceShare2 createTgInvoiceShare2() {
        return new TgInvoiceShare2();
    }

    /**
     * Create an instance of {@link TgInvoice2 }
     * 
     * @return
     *     the new instance of {@link TgInvoice2 }
     */
    public TgInvoice2 createTgInvoice2() {
        return new TgInvoice2();
    }

    /**
     * Create an instance of {@link TgQtyDeterm2 }
     * 
     * @return
     *     the new instance of {@link TgQtyDeterm2 }
     */
    public TgQtyDeterm2 createTgQtyDeterm2() {
        return new TgQtyDeterm2();
    }

    /**
     * Create an instance of {@link TgIndivAgrInfo2 }
     * 
     * @return
     *     the new instance of {@link TgIndivAgrInfo2 }
     */
    public TgIndivAgrInfo2 createTgIndivAgrInfo2() {
        return new TgIndivAgrInfo2();
    }

    /**
     * Create an instance of {@link TgMastAgrItems2 }
     * 
     * @return
     *     the new instance of {@link TgMastAgrItems2 }
     */
    public TgMastAgrItems2 createTgMastAgrItems2() {
        return new TgMastAgrItems2();
    }

    /**
     * Create an instance of {@link TgHourItem2 }
     * 
     * @return
     *     the new instance of {@link TgHourItem2 }
     */
    public TgHourItem2 createTgHourItem2() {
        return new TgHourItem2();
    }

    /**
     * Create an instance of {@link TgMaterialItem2 }
     * 
     * @return
     *     the new instance of {@link TgMaterialItem2 }
     */
    public TgMaterialItem2 createTgMaterialItem2() {
        return new TgMaterialItem2();
    }

    /**
     * Create an instance of {@link TgMarkupItemOWN2 }
     * 
     * @return
     *     the new instance of {@link TgMarkupItemOWN2 }
     */
    public TgMarkupItemOWN2 createTgMarkupItemOWN2() {
        return new TgMarkupItemOWN2();
    }

    /**
     * Create an instance of {@link TgMarkupItemCTR2 }
     * 
     * @return
     *     the new instance of {@link TgMarkupItemCTR2 }
     */
    public TgMarkupItemCTR2 createTgMarkupItemCTR2() {
        return new TgMarkupItemCTR2();
    }

    /**
     * Create an instance of {@link TgCtlgAssignQuantity2 }
     * 
     * @return
     *     the new instance of {@link TgCtlgAssignQuantity2 }
     */
    public TgCtlgAssignQuantity2 createTgCtlgAssignQuantity2() {
        return new TgCtlgAssignQuantity2();
    }

    /**
     * Create an instance of {@link TgQDetermItem2 .QTakeoff }
     * 
     * @return
     *     the new instance of {@link TgQDetermItem2 .QTakeoff }
     */
    public TgQDetermItem2 .QTakeoff createTgQDetermItem2QTakeoff() {
        return new TgQDetermItem2 .QTakeoff();
    }

    /**
     * Create an instance of {@link TgRefItems2 .Customer }
     * 
     * @return
     *     the new instance of {@link TgRefItems2 .Customer }
     */
    public TgRefItems2 .Customer createTgRefItems2Customer() {
        return new TgRefItems2 .Customer();
    }

    /**
     * Create an instance of {@link TgRefItems2 .Supplier }
     * 
     * @return
     *     the new instance of {@link TgRefItems2 .Supplier }
     */
    public TgRefItems2 .Supplier createTgRefItems2Supplier() {
        return new TgRefItems2 .Supplier();
    }

    /**
     * Create an instance of {@link TgQuotation2 .Kind }
     * 
     * @return
     *     the new instance of {@link TgQuotation2 .Kind }
     */
    public TgQuotation2 .Kind createTgQuotation2Kind() {
        return new TgQuotation2 .Kind();
    }

    /**
     * Create an instance of {@link TgPriceModification2 .Quotation }
     * 
     * @return
     *     the new instance of {@link TgPriceModification2 .Quotation }
     */
    public TgPriceModification2 .Quotation createTgPriceModification2Quotation() {
        return new TgPriceModification2 .Quotation();
    }

    /**
     * Create an instance of {@link TgCashDiscount2 .CashDiscDays }
     * 
     * @return
     *     the new instance of {@link TgCashDiscount2 .CashDiscDays }
     */
    public TgCashDiscount2 .CashDiscDays createTgCashDiscount2CashDiscDays() {
        return new TgCashDiscount2 .CashDiscDays();
    }

    /**
     * Create an instance of {@link OriginalTgTextComplement }
     * 
     * @return
     *     the new instance of {@link OriginalTgTextComplement }
     */
    public OriginalTgTextComplement createOriginalTgTextComplement() {
        return new OriginalTgTextComplement();
    }

    /**
     * Create an instance of {@link OriginalTgMarkupItem }
     * 
     * @return
     *     the new instance of {@link OriginalTgMarkupItem }
     */
    public OriginalTgMarkupItem createOriginalTgMarkupItem() {
        return new OriginalTgMarkupItem();
    }

    /**
     * Create an instance of {@link OriginalTgSubDescr }
     * 
     * @return
     *     the new instance of {@link OriginalTgSubDescr }
     */
    public OriginalTgSubDescr createOriginalTgSubDescr() {
        return new OriginalTgSubDescr();
    }

    /**
     * Create an instance of {@link OriginalTgItem }
     * 
     * @return
     *     the new instance of {@link OriginalTgItem }
     */
    public OriginalTgItem createOriginalTgItem() {
        return new OriginalTgItem();
    }

    /**
     * Create an instance of {@link OriginalTgBoQCtgy }
     * 
     * @return
     *     the new instance of {@link OriginalTgBoQCtgy }
     */
    public OriginalTgBoQCtgy createOriginalTgBoQCtgy() {
        return new OriginalTgBoQCtgy();
    }

    /**
     * Create an instance of {@link OriginalTgPerfDescr }
     * 
     * @return
     *     the new instance of {@link OriginalTgPerfDescr }
     */
    public OriginalTgPerfDescr createOriginalTgPerfDescr() {
        return new OriginalTgPerfDescr();
    }

    /**
     * Create an instance of {@link OriginalTgRemark }
     * 
     * @return
     *     the new instance of {@link OriginalTgRemark }
     */
    public OriginalTgRemark createOriginalTgRemark() {
        return new OriginalTgRemark();
    }

    /**
     * Create an instance of {@link OriginalTgBoQInfo }
     * 
     * @return
     *     the new instance of {@link OriginalTgBoQInfo }
     */
    public OriginalTgBoQInfo createOriginalTgBoQInfo() {
        return new OriginalTgBoQInfo();
    }

    /**
     * Create an instance of {@link OriginalTgItemlist }
     * 
     * @return
     *     the new instance of {@link OriginalTgItemlist }
     */
    public OriginalTgItemlist createOriginalTgItemlist() {
        return new OriginalTgItemlist();
    }

    /**
     * Create an instance of {@link OriginalTgAwardInfo }
     * 
     * @return
     *     the new instance of {@link OriginalTgAwardInfo }
     */
    public OriginalTgAwardInfo createOriginalTgAwardInfo() {
        return new OriginalTgAwardInfo();
    }

    /**
     * Create an instance of {@link OriginalTgAward }
     * 
     * @return
     *     the new instance of {@link OriginalTgAward }
     */
    public OriginalTgAward createOriginalTgAward() {
        return new OriginalTgAward();
    }

    /**
     * Create an instance of {@link OriginalTgGAEB }
     * 
     * @return
     *     the new instance of {@link OriginalTgGAEB }
     */
    public OriginalTgGAEB createOriginalTgGAEB() {
        return new OriginalTgGAEB();
    }

    /**
     * Create an instance of {@link TgQDetermItem.QTakeoff }
     * 
     * @return
     *     the new instance of {@link TgQDetermItem.QTakeoff }
     */
    public TgQDetermItem.QTakeoff createTgQDetermItemQTakeoff() {
        return new TgQDetermItem.QTakeoff();
    }

    /**
     * Create an instance of {@link TgRefItems.Customer }
     * 
     * @return
     *     the new instance of {@link TgRefItems.Customer }
     */
    public TgRefItems.Customer createTgRefItemsCustomer() {
        return new TgRefItems.Customer();
    }

    /**
     * Create an instance of {@link TgRefItems.Supplier }
     * 
     * @return
     *     the new instance of {@link TgRefItems.Supplier }
     */
    public TgRefItems.Supplier createTgRefItemsSupplier() {
        return new TgRefItems.Supplier();
    }

    /**
     * Create an instance of {@link TgQuotation.Kind }
     * 
     * @return
     *     the new instance of {@link TgQuotation.Kind }
     */
    public TgQuotation.Kind createTgQuotationKind() {
        return new TgQuotation.Kind();
    }

    /**
     * Create an instance of {@link TgPriceModification.Quotation }
     * 
     * @return
     *     the new instance of {@link TgPriceModification.Quotation }
     */
    public TgPriceModification.Quotation createTgPriceModificationQuotation() {
        return new TgPriceModification.Quotation();
    }

    /**
     * Create an instance of {@link TgCashDiscount.CashDiscDays }
     * 
     * @return
     *     the new instance of {@link TgCashDiscount.CashDiscDays }
     */
    public TgCashDiscount.CashDiscDays createTgCashDiscountCashDiscDays() {
        return new TgCashDiscount.CashDiscDays();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgGAEB2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgGAEB2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "GAEB")
    public JAXBElement<TgGAEB2> createGAEB(TgGAEB2 value) {
        return new JAXBElement<>(_GAEB_QNAME, TgGAEB2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItems2 .Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItems2 .Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Customer", scope = TgRefItems2 .class)
    public JAXBElement<TgRefItems2 .Customer> createTgRefItems2Customer(TgRefItems2 .Customer value) {
        return new JAXBElement<>(_TgRefItems2Customer_QNAME, TgRefItems2 .Customer.class, TgRefItems2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "CustomerSubNo", scope = TgRefItems2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgRefItems2CustomerSubNo(String value) {
        return new JAXBElement<>(_TgRefItems2CustomerSubNo_QNAME, String.class, TgRefItems2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "CustomerCtlgAssign", scope = TgRefItems2 .class)
    public JAXBElement<TgCtlgAssign2> createTgRefItems2CustomerCtlgAssign(TgCtlgAssign2 value) {
        return new JAXBElement<>(_TgRefItems2CustomerCtlgAssign_QNAME, TgCtlgAssign2 .class, TgRefItems2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItems2 .Supplier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItems2 .Supplier }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Supplier", scope = TgRefItems2 .class)
    public JAXBElement<TgRefItems2 .Supplier> createTgRefItems2Supplier(TgRefItems2 .Supplier value) {
        return new JAXBElement<>(_TgRefItems2Supplier_QNAME, TgRefItems2 .Supplier.class, TgRefItems2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "SupplierSubNo", scope = TgRefItems2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgRefItems2SupplierSubNo(String value) {
        return new JAXBElement<>(_TgRefItems2SupplierSubNo_QNAME, String.class, TgRefItems2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "SupplierCtlgAssign", scope = TgRefItems2 .class)
    public JAXBElement<TgCtlgAssign2> createTgRefItems2SupplierCtlgAssign(TgCtlgAssign2 value) {
        return new JAXBElement<>(_TgRefItems2SupplierCtlgAssign_QNAME, TgCtlgAssign2 .class, TgRefItems2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = TgtdTC2 .class)
    public JAXBElement<TgpTC2> createTgtdTC2P(TgpTC2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, TgpTC2 .class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgdivTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgdivTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = TgtdTC2 .class)
    public JAXBElement<TgdivTC2> createTgtdTC2Div(TgdivTC2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, TgdivTC2 .class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgtdTC2 .class)
    public JAXBElement<Tgspan2> createTgtdTC2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgtdTC2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgtdTC2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgtableTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgtableTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "table", scope = TgtdTC2 .class)
    public JAXBElement<TgtableTC2> createTgtdTC2Table(TgtableTC2 value) {
        return new JAXBElement<>(_TgtdTC2Table_QNAME, TgtableTC2 .class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgolTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgolTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ol", scope = TgtdTC2 .class)
    public JAXBElement<TgolTC2> createTgtdTC2Ol(TgolTC2 value) {
        return new JAXBElement<>(_TgtdTC2Ol_QNAME, TgolTC2 .class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgulTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgulTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ul", scope = TgtdTC2 .class)
    public JAXBElement<TgulTC2> createTgtdTC2Ul(TgulTC2 value) {
        return new JAXBElement<>(_TgtdTC2Ul_QNAME, TgulTC2 .class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "TextComplement", scope = TgtdTC2 .class)
    public JAXBElement<TgTextComplement2> createTgtdTC2TextComplement(TgTextComplement2 value) {
        return new JAXBElement<>(_TgtdTC2TextComplement_QNAME, TgTextComplement2 .class, TgtdTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = Tgtd2 .class)
    public JAXBElement<Tgp2> createTgtd2P(Tgp2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, Tgp2 .class, Tgtd2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = Tgtd2 .class)
    public JAXBElement<Tgdiv2> createTgtd2Div(Tgdiv2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, Tgdiv2 .class, Tgtd2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = Tgtd2 .class)
    public JAXBElement<Tgspan2> createTgtd2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, Tgtd2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = Tgtd2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgtd2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, Tgtd2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgtable2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgtable2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "table", scope = Tgtd2 .class)
    public JAXBElement<Tgtable2> createTgtd2Table(Tgtable2 value) {
        return new JAXBElement<>(_TgtdTC2Table_QNAME, Tgtable2 .class, Tgtd2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ol", scope = Tgtd2 .class)
    public JAXBElement<Tgol2> createTgtd2Ol(Tgol2 value) {
        return new JAXBElement<>(_TgtdTC2Ol_QNAME, Tgol2 .class, Tgtd2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ul", scope = Tgtd2 .class)
    public JAXBElement<Tgul2> createTgtd2Ul(Tgul2 value) {
        return new JAXBElement<>(_TgtdTC2Ul_QNAME, Tgul2 .class, Tgtd2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = Tgth2 .class)
    public JAXBElement<Tgp2> createTgth2P(Tgp2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, Tgp2 .class, Tgth2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = Tgth2 .class)
    public JAXBElement<Tgdiv2> createTgth2Div(Tgdiv2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, Tgdiv2 .class, Tgth2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = Tgth2 .class)
    public JAXBElement<Tgspan2> createTgth2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, Tgth2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = Tgth2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgth2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, Tgth2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgtable2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgtable2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "table", scope = Tgth2 .class)
    public JAXBElement<Tgtable2> createTgth2Table(Tgtable2 value) {
        return new JAXBElement<>(_TgtdTC2Table_QNAME, Tgtable2 .class, Tgth2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ul", scope = Tgth2 .class)
    public JAXBElement<Tgul2> createTgth2Ul(Tgul2 value) {
        return new JAXBElement<>(_TgtdTC2Ul_QNAME, Tgul2 .class, Tgth2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ol", scope = Tgth2 .class)
    public JAXBElement<Tgol2> createTgth2Ol(Tgol2 value) {
        return new JAXBElement<>(_TgtdTC2Ol_QNAME, Tgol2 .class, Tgth2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = TgliTC2 .class)
    public JAXBElement<TgpTC2> createTgliTC2P(TgpTC2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, TgpTC2 .class, TgliTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgdivTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgdivTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = TgliTC2 .class)
    public JAXBElement<TgdivTC2> createTgliTC2Div(TgdivTC2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, TgdivTC2 .class, TgliTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgliTC2 .class)
    public JAXBElement<Tgspan2> createTgliTC2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgliTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgliTC2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgliTC2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgliTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgulTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgulTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ul", scope = TgliTC2 .class)
    public JAXBElement<TgulTC2> createTgliTC2Ul(TgulTC2 value) {
        return new JAXBElement<>(_TgtdTC2Ul_QNAME, TgulTC2 .class, TgliTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgolTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgolTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ol", scope = TgliTC2 .class)
    public JAXBElement<TgolTC2> createTgliTC2Ol(TgolTC2 value) {
        return new JAXBElement<>(_TgtdTC2Ol_QNAME, TgolTC2 .class, TgliTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "TextComplement", scope = TgliTC2 .class)
    public JAXBElement<TgTextComplement2> createTgliTC2TextComplement(TgTextComplement2 value) {
        return new JAXBElement<>(_TgtdTC2TextComplement_QNAME, TgTextComplement2 .class, TgliTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = Tgli2 .class)
    public JAXBElement<Tgp2> createTgli2P(Tgp2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, Tgp2 .class, Tgli2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = Tgli2 .class)
    public JAXBElement<Tgdiv2> createTgli2Div(Tgdiv2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, Tgdiv2 .class, Tgli2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = Tgli2 .class)
    public JAXBElement<Tgspan2> createTgli2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, Tgli2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = Tgli2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgli2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, Tgli2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ul", scope = Tgli2 .class)
    public JAXBElement<Tgul2> createTgli2Ul(Tgul2 value) {
        return new JAXBElement<>(_TgtdTC2Ul_QNAME, Tgul2 .class, Tgli2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ol", scope = Tgli2 .class)
    public JAXBElement<Tgol2> createTgli2Ol(Tgol2 value) {
        return new JAXBElement<>(_TgtdTC2Ol_QNAME, Tgol2 .class, Tgli2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgdivTC2 .class)
    public JAXBElement<Tgspan2> createTgdivTC2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgdivTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgdivTC2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgdivTC2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgdivTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "TextComplement", scope = TgdivTC2 .class)
    public JAXBElement<TgTextComplement2> createTgdivTC2TextComplement(TgTextComplement2 value) {
        return new JAXBElement<>(_TgtdTC2TextComplement_QNAME, TgTextComplement2 .class, TgdivTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = Tgdiv2 .class)
    public JAXBElement<Tgspan2> createTgdiv2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, Tgdiv2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = Tgdiv2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgdiv2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, Tgdiv2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgpMLText2 .class)
    public JAXBElement<Tgspan2> createTgpMLText2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgpMLText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgpMLText2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgpMLText2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgpMLText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgpTC2 .class)
    public JAXBElement<Tgspan2> createTgpTC2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgpTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgpTC2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgpTC2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgpTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "image", scope = TgpTC2 .class)
    public JAXBElement<TgImage2> createTgpTC2Image(TgImage2 value) {
        return new JAXBElement<>(_TgpTC2Image_QNAME, TgImage2 .class, TgpTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "TextComplement", scope = TgpTC2 .class)
    public JAXBElement<TgTextComplement2> createTgpTC2TextComplement(TgTextComplement2 value) {
        return new JAXBElement<>(_TgtdTC2TextComplement_QNAME, TgTextComplement2 .class, TgpTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = Tgp2 .class)
    public JAXBElement<Tgspan2> createTgp2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, Tgp2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = Tgp2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgp2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, Tgp2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "image", scope = Tgp2 .class)
    public JAXBElement<TgImage2> createTgp2Image(TgImage2 value) {
        return new JAXBElement<>(_TgpTC2Image_QNAME, TgImage2 .class, Tgp2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpMLText2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpMLText2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = TgMLText2 .class)
    public JAXBElement<TgpMLText2> createTgMLText2P(TgpMLText2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, TgpMLText2 .class, TgMLText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = TgMLText2 .class)
    public JAXBElement<Tgdiv2> createTgMLText2Div(Tgdiv2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, Tgdiv2 .class, TgMLText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgMLText2 .class)
    public JAXBElement<Tgspan2> createTgMLText2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgMLText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgMLText2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgMLText2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgMLText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = TgFText2 .class)
    public JAXBElement<Tgp2> createTgFText2P(Tgp2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, Tgp2 .class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = TgFText2 .class)
    public JAXBElement<Tgdiv2> createTgFText2Div(Tgdiv2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, Tgdiv2 .class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgFText2 .class)
    public JAXBElement<Tgspan2> createTgFText2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ul", scope = TgFText2 .class)
    public JAXBElement<Tgul2> createTgFText2Ul(Tgul2 value) {
        return new JAXBElement<>(_TgtdTC2Ul_QNAME, Tgul2 .class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ol", scope = TgFText2 .class)
    public JAXBElement<Tgol2> createTgFText2Ol(Tgol2 value) {
        return new JAXBElement<>(_TgtdTC2Ol_QNAME, Tgol2 .class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgtable2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgtable2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "table", scope = TgFText2 .class)
    public JAXBElement<Tgtable2> createTgFText2Table(Tgtable2 value) {
        return new JAXBElement<>(_TgtdTC2Table_QNAME, Tgtable2 .class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgFText2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFText2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "page", scope = TgFText2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFText2Page(String value) {
        return new JAXBElement<>(_TgFText2Page_QNAME, String.class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Image", scope = TgFText2 .class)
    public JAXBElement<TgImage2> createTgFText2Image(TgImage2 value) {
        return new JAXBElement<>(_TgFText2Image_QNAME, TgImage2 .class, TgFText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "p", scope = TgFTextTC2 .class)
    public JAXBElement<TgpTC2> createTgFTextTC2P(TgpTC2 value) {
        return new JAXBElement<>(_TgtdTC2P_QNAME, TgpTC2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgdivTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgdivTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "div", scope = TgFTextTC2 .class)
    public JAXBElement<TgdivTC2> createTgFTextTC2Div(TgdivTC2 value) {
        return new JAXBElement<>(_TgtdTC2Div_QNAME, TgdivTC2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "span", scope = TgFTextTC2 .class)
    public JAXBElement<Tgspan2> createTgFTextTC2Span(Tgspan2 value) {
        return new JAXBElement<>(_TgtdTC2Span_QNAME, Tgspan2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgulTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgulTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ul", scope = TgFTextTC2 .class)
    public JAXBElement<TgulTC2> createTgFTextTC2Ul(TgulTC2 value) {
        return new JAXBElement<>(_TgtdTC2Ul_QNAME, TgulTC2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgolTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgolTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ol", scope = TgFTextTC2 .class)
    public JAXBElement<TgolTC2> createTgFTextTC2Ol(TgolTC2 value) {
        return new JAXBElement<>(_TgtdTC2Ol_QNAME, TgolTC2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgtableTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgtableTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "table", scope = TgFTextTC2 .class)
    public JAXBElement<TgtableTC2> createTgFTextTC2Table(TgtableTC2 value) {
        return new JAXBElement<>(_TgtdTC2Table_QNAME, TgtableTC2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "br", scope = TgFTextTC2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFTextTC2Br(String value) {
        return new JAXBElement<>(_TgtdTC2Br_QNAME, String.class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "page", scope = TgFTextTC2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFTextTC2Page(String value) {
        return new JAXBElement<>(_TgFText2Page_QNAME, String.class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Image", scope = TgFTextTC2 .class)
    public JAXBElement<TgImage2> createTgFTextTC2Image(TgImage2 value) {
        return new JAXBElement<>(_TgFText2Image_QNAME, TgImage2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "TextComplement", scope = TgFTextTC2 .class)
    public JAXBElement<TgTextComplement2> createTgFTextTC2TextComplement(TgTextComplement2 value) {
        return new JAXBElement<>(_TgtdTC2TextComplement_QNAME, TgTextComplement2 .class, TgFTextTC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgFTextTC2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgFTextTC2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Text", scope = TgBoQText2 .class)
    public JAXBElement<TgFTextTC2> createTgBoQText2Text(TgFTextTC2 value) {
        return new JAXBElement<>(_TgBoQText2Text_QNAME, TgFTextTC2 .class, TgBoQText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "TextComplement", scope = TgBoQText2 .class)
    public JAXBElement<TgTextComplement2> createTgBoQText2TextComplement(TgTextComplement2 value) {
        return new JAXBElement<>(_TgtdTC2TextComplement_QNAME, TgTextComplement2 .class, TgBoQText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "attachment", scope = TgBoQText2 .class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgBoQText2Attachment(String value) {
        return new JAXBElement<>(_TgBoQText2Attachment_QNAME, String.class, TgBoQText2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ALNGroupNo", scope = OriginalTgItem.class)
    public JAXBElement<Integer> createOriginalTgItemALNGroupNo(Integer value) {
        return new JAXBElement<>(_OriginalTgItemALNGroupNo_QNAME, Integer.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ALNSerNo", scope = OriginalTgItem.class)
    public JAXBElement<Integer> createOriginalTgItemALNSerNo(Integer value) {
        return new JAXBElement<>(_OriginalTgItemALNSerNo_QNAME, Integer.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgAccepted2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgAccepted2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Accepted", scope = OriginalTgItem.class)
    public JAXBElement<TgAccepted2> createOriginalTgItemAccepted(TgAccepted2 value) {
        return new JAXBElement<>(_OriginalTgItemAccepted_QNAME, TgAccepted2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgProvis2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgProvis2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Provis", scope = OriginalTgItem.class)
    public JAXBElement<TgProvis2> createOriginalTgItemProvis(TgProvis2 value) {
        return new JAXBElement<>(_OriginalTgItemProvis_QNAME, TgProvis2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "ProvisAccpt", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemProvisAccpt(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemProvisAccpt_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "LumpSumItem", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemLumpSumItem(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemLumpSumItem_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "NotAppl", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemNotAppl(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemNotAppl_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "NotOffered", scope = OriginalTgItem.class)
    public JAXBElement<TgYes2> createOriginalTgItemNotOffered(TgYes2 value) {
        return new JAXBElement<>(_OriginalTgItemNotOffered_QNAME, TgYes2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "HourIt", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemHourIt(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemHourIt_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "KeyIt", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemKeyIt(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemKeyIt_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPBkdn", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemUPBkdn(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemUPBkdn_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "MarkupIt", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemMarkupIt(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemMarkupIt_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "CONo", scope = OriginalTgItem.class)
    public JAXBElement<Integer> createOriginalTgItemCONo(Integer value) {
        return new JAXBElement<>(_OriginalTgItemCONo_QNAME, Integer.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCOStatus2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCOStatus2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "COStatus", scope = OriginalTgItem.class)
    public JAXBElement<TgCOStatus2> createOriginalTgItemCOStatus(TgCOStatus2 value) {
        return new JAXBElement<>(_OriginalTgItemCOStatus_QNAME, TgCOStatus2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefDescr2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefDescr2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "RefDescr", scope = OriginalTgItem.class)
    public JAXBElement<TgRefDescr2> createOriginalTgItemRefDescr(TgRefDescr2 value) {
        return new JAXBElement<>(_OriginalTgItemRefDescr_QNAME, TgRefDescr2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "RefRNo", scope = OriginalTgItem.class)
    public JAXBElement<TgRefItem2> createOriginalTgItemRefRNo(TgRefItem2 value) {
        return new JAXBElement<>(_OriginalTgItemRefRNo_QNAME, TgRefItem2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "RefPerfNo", scope = OriginalTgItem.class)
    public JAXBElement<TgRefItem2> createOriginalTgItemRefPerfNo(TgRefItem2 value) {
        return new JAXBElement<>(_OriginalTgItemRefPerfNo_QNAME, TgRefItem2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgHoldOutType2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgHoldOutType2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "HoldOutType", scope = OriginalTgItem.class)
    public JAXBElement<TgHoldOutType2> createOriginalTgItemHoldOutType(TgHoldOutType2 value) {
        return new JAXBElement<>(_OriginalTgItemHoldOutType_QNAME, TgHoldOutType2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UseDur", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUseDur(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUseDur_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgUseDurLblTime2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgUseDurLblTime2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UseDurLblTime", scope = OriginalTgItem.class)
    public JAXBElement<TgUseDurLblTime2> createOriginalTgItemUseDurLblTime(TgUseDurLblTime2 value) {
        return new JAXBElement<>(_OriginalTgItemUseDurLblTime_QNAME, TgUseDurLblTime2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "RefBaseItem", scope = OriginalTgItem.class)
    public JAXBElement<TgRefItem2> createOriginalTgItemRefBaseItem(TgRefItem2 value) {
        return new JAXBElement<>(_OriginalTgItemRefBaseItem_QNAME, TgRefItem2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "QtyTBD", scope = OriginalTgItem.class)
    public JAXBElement<TgYes2> createOriginalTgItemQtyTBD(TgYes2 value) {
        return new JAXBElement<>(_OriginalTgItemQtyTBD_QNAME, TgYes2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Qty", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemQty(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemQty_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgQtySplit2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgQtySplit2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "QtySplit", scope = OriginalTgItem.class)
    public JAXBElement<TgQtySplit2> createOriginalTgItemQtySplit(TgQtySplit2 value) {
        return new JAXBElement<>(_OriginalTgItemQtySplit_QNAME, TgQtySplit2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "PredQty", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemPredQty(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemPredQty_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "BillQty", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemBillQty(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemBillQty_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "QU", scope = OriginalTgItem.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOriginalTgItemQU(String value) {
        return new JAXBElement<>(_OriginalTgItemQU_QNAME, String.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "CtlgAssign", scope = OriginalTgItem.class)
    public JAXBElement<TgCtlgAssign2> createOriginalTgItemCtlgAssign(TgCtlgAssign2 value) {
        return new JAXBElement<>(_OriginalTgItemCtlgAssign_QNAME, TgCtlgAssign2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UP", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUP(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUP_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UP110", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUP110(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUP110_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPComp1", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPComp1(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPComp1_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPComp2", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPComp2(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPComp2_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPComp3", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPComp3(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPComp3_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPComp4", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPComp4(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPComp4_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPComp5", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPComp5(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPComp5_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPComp6", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPComp6(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPComp6_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "DiscountPcnt", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemDiscountPcnt(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemDiscountPcnt_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPFrom", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPFrom(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPFrom_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPAvg", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPAvg(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPAvg_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPTo", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPTo(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPTo_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPWgFrom", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPWgFrom(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPWgFrom_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPWgAvg", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPWgAvg(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPWgAvg_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "UPWgTo", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemUPWgTo(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemUPWgTo_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "IT", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemIT(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemIT_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "VAT", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemVAT(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemVAT_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgPriceInfo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgPriceInfo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "PriceInfo", scope = OriginalTgItem.class)
    public JAXBElement<TgPriceInfo2> createOriginalTgItemPriceInfo(TgPriceInfo2 value) {
        return new JAXBElement<>(_OriginalTgItemPriceInfo_QNAME, TgPriceInfo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "TimeQu", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemTimeQu(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemTimeQu_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgDescription2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgDescription2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Description", scope = OriginalTgItem.class)
    public JAXBElement<TgDescription2> createOriginalTgItemDescription(TgDescription2 value) {
        return new JAXBElement<>(_OriginalTgItemDescription_QNAME, TgDescription2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgMLText2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgMLText2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "BidComm", scope = OriginalTgItem.class)
    public JAXBElement<TgMLText2> createOriginalTgItemBidComm(TgMLText2 value) {
        return new JAXBElement<>(_OriginalTgItemBidComm_QNAME, TgMLText2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "SumDescr", scope = OriginalTgItem.class)
    public JAXBElement<TgYes2> createOriginalTgItemSumDescr(TgYes2 value) {
        return new JAXBElement<>(_OriginalTgItemSumDescr_QNAME, TgYes2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgSubDescr2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgSubDescr2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "SubDescr", scope = OriginalTgItem.class)
    public JAXBElement<TgSubDescr2> createOriginalTgItemSubDescr(TgSubDescr2 value) {
        return new JAXBElement<>(_OriginalTgItemSubDescr_QNAME, TgSubDescr2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgProduct2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgProduct2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "Product", scope = OriginalTgItem.class)
    public JAXBElement<TgProduct2> createOriginalTgItemProduct(TgProduct2 value) {
        return new JAXBElement<>(_OriginalTgItemProduct_QNAME, TgProduct2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgAlterBidStatus2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgAlterBidStatus2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "AlterBidStatus", scope = OriginalTgItem.class)
    public JAXBElement<TgAlterBidStatus2> createOriginalTgItemAlterBidStatus(TgAlterBidStatus2 value) {
        return new JAXBElement<>(_OriginalTgItemAlterBidStatus_QNAME, TgAlterBidStatus2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCostApproach2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCostApproach2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "CostApproach", scope = OriginalTgItem.class)
    public JAXBElement<TgCostApproach2> createOriginalTgItemCostApproach(TgCostApproach2 value) {
        return new JAXBElement<>(_OriginalTgItemCostApproach_QNAME, TgCostApproach2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCheckNote2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCheckNote2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "CheckNote", scope = OriginalTgItem.class)
    public JAXBElement<TgCheckNote2> createOriginalTgItemCheckNote(TgCheckNote2 value) {
        return new JAXBElement<>(_OriginalTgItemCheckNote_QNAME, TgCheckNote2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgQtyDeterm2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgQtyDeterm2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "QtyDeterm", scope = OriginalTgItem.class)
    public JAXBElement<TgQtyDeterm2> createOriginalTgItemQtyDeterm(TgQtyDeterm2 value) {
        return new JAXBElement<>(_OriginalTgItemQtyDeterm_QNAME, TgQtyDeterm2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "BidUpDownReq", scope = OriginalTgItem.class)
    public JAXBElement<TgYesNo2> createOriginalTgItemBidUpDownReq(TgYesNo2 value) {
        return new JAXBElement<>(_OriginalTgItemBidUpDownReq_QNAME, TgYesNo2 .class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", name = "BidUpDownPct", scope = OriginalTgItem.class)
    public JAXBElement<BigDecimal> createOriginalTgItemBidUpDownPct(BigDecimal value) {
        return new JAXBElement<>(_OriginalTgItemBidUpDownPct_QNAME, BigDecimal.class, OriginalTgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItems.Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItems.Customer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Customer", scope = TgRefItems.class)
    public JAXBElement<TgRefItems.Customer> createTgRefItemsCustomer(TgRefItems.Customer value) {
        return new JAXBElement<>(_TgRefItemsCustomer_QNAME, TgRefItems.Customer.class, TgRefItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CustomerSubNo", scope = TgRefItems.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgRefItemsCustomerSubNo(String value) {
        return new JAXBElement<>(_TgRefItemsCustomerSubNo_QNAME, String.class, TgRefItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CustomerCtlgAssign", scope = TgRefItems.class)
    public JAXBElement<TgCtlgAssign> createTgRefItemsCustomerCtlgAssign(TgCtlgAssign value) {
        return new JAXBElement<>(_TgRefItemsCustomerCtlgAssign_QNAME, TgCtlgAssign.class, TgRefItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItems.Supplier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItems.Supplier }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Supplier", scope = TgRefItems.class)
    public JAXBElement<TgRefItems.Supplier> createTgRefItemsSupplier(TgRefItems.Supplier value) {
        return new JAXBElement<>(_TgRefItemsSupplier_QNAME, TgRefItems.Supplier.class, TgRefItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SupplierSubNo", scope = TgRefItems.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgRefItemsSupplierSubNo(String value) {
        return new JAXBElement<>(_TgRefItemsSupplierSubNo_QNAME, String.class, TgRefItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SupplierCtlgAssign", scope = TgRefItems.class)
    public JAXBElement<TgCtlgAssign> createTgRefItemsSupplierCtlgAssign(TgCtlgAssign value) {
        return new JAXBElement<>(_TgRefItemsSupplierCtlgAssign_QNAME, TgCtlgAssign.class, TgRefItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = TgtdTC.class)
    public JAXBElement<TgpTC> createTgtdTCP(TgpTC value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, TgpTC.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgdivTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgdivTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = TgtdTC.class)
    public JAXBElement<TgdivTC> createTgtdTCDiv(TgdivTC value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, TgdivTC.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgtdTC.class)
    public JAXBElement<Tgspan> createTgtdTCSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgtdTC.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgtdTCBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgtableTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgtableTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "table", scope = TgtdTC.class)
    public JAXBElement<TgtableTC> createTgtdTCTable(TgtableTC value) {
        return new JAXBElement<>(_TgtdTCTable_QNAME, TgtableTC.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgolTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgolTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ol", scope = TgtdTC.class)
    public JAXBElement<TgolTC> createTgtdTCOl(TgolTC value) {
        return new JAXBElement<>(_TgtdTCOl_QNAME, TgolTC.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgulTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgulTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ul", scope = TgtdTC.class)
    public JAXBElement<TgulTC> createTgtdTCUl(TgulTC value) {
        return new JAXBElement<>(_TgtdTCUl_QNAME, TgulTC.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TextComplement", scope = TgtdTC.class)
    public JAXBElement<TgTextComplement> createTgtdTCTextComplement(TgTextComplement value) {
        return new JAXBElement<>(_TgtdTCTextComplement_QNAME, TgTextComplement.class, TgtdTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = Tgtd.class)
    public JAXBElement<Tgp> createTgtdP(Tgp value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, Tgp.class, Tgtd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = Tgtd.class)
    public JAXBElement<Tgdiv> createTgtdDiv(Tgdiv value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, Tgdiv.class, Tgtd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = Tgtd.class)
    public JAXBElement<Tgspan> createTgtdSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, Tgtd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = Tgtd.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgtdBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, Tgtd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgtable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgtable }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "table", scope = Tgtd.class)
    public JAXBElement<Tgtable> createTgtdTable(Tgtable value) {
        return new JAXBElement<>(_TgtdTCTable_QNAME, Tgtable.class, Tgtd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ol", scope = Tgtd.class)
    public JAXBElement<Tgol> createTgtdOl(Tgol value) {
        return new JAXBElement<>(_TgtdTCOl_QNAME, Tgol.class, Tgtd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ul", scope = Tgtd.class)
    public JAXBElement<Tgul> createTgtdUl(Tgul value) {
        return new JAXBElement<>(_TgtdTCUl_QNAME, Tgul.class, Tgtd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = Tgth.class)
    public JAXBElement<Tgp> createTgthP(Tgp value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, Tgp.class, Tgth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = Tgth.class)
    public JAXBElement<Tgdiv> createTgthDiv(Tgdiv value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, Tgdiv.class, Tgth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = Tgth.class)
    public JAXBElement<Tgspan> createTgthSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, Tgth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = Tgth.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgthBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, Tgth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgtable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgtable }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "table", scope = Tgth.class)
    public JAXBElement<Tgtable> createTgthTable(Tgtable value) {
        return new JAXBElement<>(_TgtdTCTable_QNAME, Tgtable.class, Tgth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ul", scope = Tgth.class)
    public JAXBElement<Tgul> createTgthUl(Tgul value) {
        return new JAXBElement<>(_TgtdTCUl_QNAME, Tgul.class, Tgth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ol", scope = Tgth.class)
    public JAXBElement<Tgol> createTgthOl(Tgol value) {
        return new JAXBElement<>(_TgtdTCOl_QNAME, Tgol.class, Tgth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = TgliTC.class)
    public JAXBElement<TgpTC> createTgliTCP(TgpTC value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, TgpTC.class, TgliTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgdivTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgdivTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = TgliTC.class)
    public JAXBElement<TgdivTC> createTgliTCDiv(TgdivTC value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, TgdivTC.class, TgliTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgliTC.class)
    public JAXBElement<Tgspan> createTgliTCSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgliTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgliTC.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgliTCBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgliTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgulTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgulTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ul", scope = TgliTC.class)
    public JAXBElement<TgulTC> createTgliTCUl(TgulTC value) {
        return new JAXBElement<>(_TgtdTCUl_QNAME, TgulTC.class, TgliTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgolTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgolTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ol", scope = TgliTC.class)
    public JAXBElement<TgolTC> createTgliTCOl(TgolTC value) {
        return new JAXBElement<>(_TgtdTCOl_QNAME, TgolTC.class, TgliTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TextComplement", scope = TgliTC.class)
    public JAXBElement<TgTextComplement> createTgliTCTextComplement(TgTextComplement value) {
        return new JAXBElement<>(_TgtdTCTextComplement_QNAME, TgTextComplement.class, TgliTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = Tgli.class)
    public JAXBElement<Tgp> createTgliP(Tgp value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, Tgp.class, Tgli.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = Tgli.class)
    public JAXBElement<Tgdiv> createTgliDiv(Tgdiv value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, Tgdiv.class, Tgli.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = Tgli.class)
    public JAXBElement<Tgspan> createTgliSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, Tgli.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = Tgli.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgliBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, Tgli.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ul", scope = Tgli.class)
    public JAXBElement<Tgul> createTgliUl(Tgul value) {
        return new JAXBElement<>(_TgtdTCUl_QNAME, Tgul.class, Tgli.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ol", scope = Tgli.class)
    public JAXBElement<Tgol> createTgliOl(Tgol value) {
        return new JAXBElement<>(_TgtdTCOl_QNAME, Tgol.class, Tgli.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgdivTC.class)
    public JAXBElement<Tgspan> createTgdivTCSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgdivTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgdivTC.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgdivTCBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgdivTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TextComplement", scope = TgdivTC.class)
    public JAXBElement<TgTextComplement> createTgdivTCTextComplement(TgTextComplement value) {
        return new JAXBElement<>(_TgtdTCTextComplement_QNAME, TgTextComplement.class, TgdivTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = Tgdiv.class)
    public JAXBElement<Tgspan> createTgdivSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, Tgdiv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = Tgdiv.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgdivBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, Tgdiv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgpMLText.class)
    public JAXBElement<Tgspan> createTgpMLTextSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgpMLText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgpMLText.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgpMLTextBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgpMLText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgpTC.class)
    public JAXBElement<Tgspan> createTgpTCSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgpTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgpTC.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgpTCBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgpTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "image", scope = TgpTC.class)
    public JAXBElement<TgImage> createTgpTCImage(TgImage value) {
        return new JAXBElement<>(_TgpTCImage_QNAME, TgImage.class, TgpTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TextComplement", scope = TgpTC.class)
    public JAXBElement<TgTextComplement> createTgpTCTextComplement(TgTextComplement value) {
        return new JAXBElement<>(_TgtdTCTextComplement_QNAME, TgTextComplement.class, TgpTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = Tgp.class)
    public JAXBElement<Tgspan> createTgpSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, Tgp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = Tgp.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgpBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, Tgp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "image", scope = Tgp.class)
    public JAXBElement<TgImage> createTgpImage(TgImage value) {
        return new JAXBElement<>(_TgpTCImage_QNAME, TgImage.class, Tgp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpMLText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpMLText }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = TgMLText.class)
    public JAXBElement<TgpMLText> createTgMLTextP(TgpMLText value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, TgpMLText.class, TgMLText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = TgMLText.class)
    public JAXBElement<Tgdiv> createTgMLTextDiv(Tgdiv value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, Tgdiv.class, TgMLText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgMLText.class)
    public JAXBElement<Tgspan> createTgMLTextSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgMLText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgMLText.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgMLTextBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgMLText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = TgFText.class)
    public JAXBElement<Tgp> createTgFTextP(Tgp value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, Tgp.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = TgFText.class)
    public JAXBElement<Tgdiv> createTgFTextDiv(Tgdiv value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, Tgdiv.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgFText.class)
    public JAXBElement<Tgspan> createTgFTextSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgul }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ul", scope = TgFText.class)
    public JAXBElement<Tgul> createTgFTextUl(Tgul value) {
        return new JAXBElement<>(_TgtdTCUl_QNAME, Tgul.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ol", scope = TgFText.class)
    public JAXBElement<Tgol> createTgFTextOl(Tgol value) {
        return new JAXBElement<>(_TgtdTCOl_QNAME, Tgol.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgtable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgtable }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "table", scope = TgFText.class)
    public JAXBElement<Tgtable> createTgFTextTable(Tgtable value) {
        return new JAXBElement<>(_TgtdTCTable_QNAME, Tgtable.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgFText.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFTextBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "page", scope = TgFText.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFTextPage(String value) {
        return new JAXBElement<>(_TgFTextPage_QNAME, String.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Image", scope = TgFText.class)
    public JAXBElement<TgImage> createTgFTextImage(TgImage value) {
        return new JAXBElement<>(_TgFTextImage_QNAME, TgImage.class, TgFText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgpTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgpTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "p", scope = TgFTextTC.class)
    public JAXBElement<TgpTC> createTgFTextTCP(TgpTC value) {
        return new JAXBElement<>(_TgtdTCP_QNAME, TgpTC.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgdivTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgdivTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "div", scope = TgFTextTC.class)
    public JAXBElement<TgdivTC> createTgFTextTCDiv(TgdivTC value) {
        return new JAXBElement<>(_TgtdTCDiv_QNAME, TgdivTC.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "span", scope = TgFTextTC.class)
    public JAXBElement<Tgspan> createTgFTextTCSpan(Tgspan value) {
        return new JAXBElement<>(_TgtdTCSpan_QNAME, Tgspan.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgulTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgulTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ul", scope = TgFTextTC.class)
    public JAXBElement<TgulTC> createTgFTextTCUl(TgulTC value) {
        return new JAXBElement<>(_TgtdTCUl_QNAME, TgulTC.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgolTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgolTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ol", scope = TgFTextTC.class)
    public JAXBElement<TgolTC> createTgFTextTCOl(TgolTC value) {
        return new JAXBElement<>(_TgtdTCOl_QNAME, TgolTC.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgtableTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgtableTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "table", scope = TgFTextTC.class)
    public JAXBElement<TgtableTC> createTgFTextTCTable(TgtableTC value) {
        return new JAXBElement<>(_TgtdTCTable_QNAME, TgtableTC.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "br", scope = TgFTextTC.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFTextTCBr(String value) {
        return new JAXBElement<>(_TgtdTCBr_QNAME, String.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "page", scope = TgFTextTC.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgFTextTCPage(String value) {
        return new JAXBElement<>(_TgFTextPage_QNAME, String.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Image", scope = TgFTextTC.class)
    public JAXBElement<TgImage> createTgFTextTCImage(TgImage value) {
        return new JAXBElement<>(_TgFTextImage_QNAME, TgImage.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TextComplement", scope = TgFTextTC.class)
    public JAXBElement<TgTextComplement> createTgFTextTCTextComplement(TgTextComplement value) {
        return new JAXBElement<>(_TgtdTCTextComplement_QNAME, TgTextComplement.class, TgFTextTC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgFTextTC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgFTextTC }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Text", scope = TgBoQText.class)
    public JAXBElement<TgFTextTC> createTgBoQTextText(TgFTextTC value) {
        return new JAXBElement<>(_TgBoQTextText_QNAME, TgFTextTC.class, TgBoQText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TextComplement", scope = TgBoQText.class)
    public JAXBElement<TgTextComplement> createTgBoQTextTextComplement(TgTextComplement value) {
        return new JAXBElement<>(_TgtdTCTextComplement_QNAME, TgTextComplement.class, TgBoQText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "attachment", scope = TgBoQText.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgBoQTextAttachment(String value) {
        return new JAXBElement<>(_TgBoQTextAttachment_QNAME, String.class, TgBoQText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ALNGroupNo", scope = TgItem.class)
    public JAXBElement<Integer> createTgItemALNGroupNo(Integer value) {
        return new JAXBElement<>(_TgItemALNGroupNo_QNAME, Integer.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ALNSerNo", scope = TgItem.class)
    public JAXBElement<Integer> createTgItemALNSerNo(Integer value) {
        return new JAXBElement<>(_TgItemALNSerNo_QNAME, Integer.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgAccepted }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgAccepted }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Accepted", scope = TgItem.class)
    public JAXBElement<TgAccepted> createTgItemAccepted(TgAccepted value) {
        return new JAXBElement<>(_TgItemAccepted_QNAME, TgAccepted.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgProvis }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgProvis }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Provis", scope = TgItem.class)
    public JAXBElement<TgProvis> createTgItemProvis(TgProvis value) {
        return new JAXBElement<>(_TgItemProvis_QNAME, TgProvis.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ProvisAccpt", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemProvisAccpt(TgYesNo value) {
        return new JAXBElement<>(_TgItemProvisAccpt_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "LumpSumItem", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemLumpSumItem(TgYesNo value) {
        return new JAXBElement<>(_TgItemLumpSumItem_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "NotAppl", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemNotAppl(TgYesNo value) {
        return new JAXBElement<>(_TgItemNotAppl_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "NotOffered", scope = TgItem.class)
    public JAXBElement<TgYes> createTgItemNotOffered(TgYes value) {
        return new JAXBElement<>(_TgItemNotOffered_QNAME, TgYes.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "HourIt", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemHourIt(TgYesNo value) {
        return new JAXBElement<>(_TgItemHourIt_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "KeyIt", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemKeyIt(TgYesNo value) {
        return new JAXBElement<>(_TgItemKeyIt_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPBkdn", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemUPBkdn(TgYesNo value) {
        return new JAXBElement<>(_TgItemUPBkdn_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "MarkupIt", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemMarkupIt(TgYesNo value) {
        return new JAXBElement<>(_TgItemMarkupIt_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CONo", scope = TgItem.class)
    public JAXBElement<Integer> createTgItemCONo(Integer value) {
        return new JAXBElement<>(_TgItemCONo_QNAME, Integer.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCOStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCOStatus }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "COStatus", scope = TgItem.class)
    public JAXBElement<TgCOStatus> createTgItemCOStatus(TgCOStatus value) {
        return new JAXBElement<>(_TgItemCOStatus_QNAME, TgCOStatus.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefDescr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefDescr }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RefDescr", scope = TgItem.class)
    public JAXBElement<TgRefDescr> createTgItemRefDescr(TgRefDescr value) {
        return new JAXBElement<>(_TgItemRefDescr_QNAME, TgRefDescr.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RefRNo", scope = TgItem.class)
    public JAXBElement<TgRefItem> createTgItemRefRNo(TgRefItem value) {
        return new JAXBElement<>(_TgItemRefRNo_QNAME, TgRefItem.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RefPerfNo", scope = TgItem.class)
    public JAXBElement<TgRefItem> createTgItemRefPerfNo(TgRefItem value) {
        return new JAXBElement<>(_TgItemRefPerfNo_QNAME, TgRefItem.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgHoldOutType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgHoldOutType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "HoldOutType", scope = TgItem.class)
    public JAXBElement<TgHoldOutType> createTgItemHoldOutType(TgHoldOutType value) {
        return new JAXBElement<>(_TgItemHoldOutType_QNAME, TgHoldOutType.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UseDur", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUseDur(BigDecimal value) {
        return new JAXBElement<>(_TgItemUseDur_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgUseDurLblTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgUseDurLblTime }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UseDurLblTime", scope = TgItem.class)
    public JAXBElement<TgUseDurLblTime> createTgItemUseDurLblTime(TgUseDurLblTime value) {
        return new JAXBElement<>(_TgItemUseDurLblTime_QNAME, TgUseDurLblTime.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RefBaseItem", scope = TgItem.class)
    public JAXBElement<TgRefItem> createTgItemRefBaseItem(TgRefItem value) {
        return new JAXBElement<>(_TgItemRefBaseItem_QNAME, TgRefItem.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "QtyTBD", scope = TgItem.class)
    public JAXBElement<TgYes> createTgItemQtyTBD(TgYes value) {
        return new JAXBElement<>(_TgItemQtyTBD_QNAME, TgYes.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Qty", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemQty(BigDecimal value) {
        return new JAXBElement<>(_TgItemQty_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgQtySplit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgQtySplit }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "QtySplit", scope = TgItem.class)
    public JAXBElement<TgQtySplit> createTgItemQtySplit(TgQtySplit value) {
        return new JAXBElement<>(_TgItemQtySplit_QNAME, TgQtySplit.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PredQty", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemPredQty(BigDecimal value) {
        return new JAXBElement<>(_TgItemPredQty_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BillQty", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemBillQty(BigDecimal value) {
        return new JAXBElement<>(_TgItemBillQty_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "QU", scope = TgItem.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTgItemQU(String value) {
        return new JAXBElement<>(_TgItemQU_QNAME, String.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCtlgAssign }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CtlgAssign", scope = TgItem.class)
    public JAXBElement<TgCtlgAssign> createTgItemCtlgAssign(TgCtlgAssign value) {
        return new JAXBElement<>(_TgItemCtlgAssign_QNAME, TgCtlgAssign.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UP", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUP(BigDecimal value) {
        return new JAXBElement<>(_TgItemUP_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UP110", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUP110(BigDecimal value) {
        return new JAXBElement<>(_TgItemUP110_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPComp1", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPComp1(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPComp1_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPComp2", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPComp2(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPComp2_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPComp3", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPComp3(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPComp3_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPComp4", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPComp4(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPComp4_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPComp5", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPComp5(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPComp5_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPComp6", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPComp6(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPComp6_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DiscountPcnt", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemDiscountPcnt(BigDecimal value) {
        return new JAXBElement<>(_TgItemDiscountPcnt_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPFrom", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPFrom(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPFrom_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPAvg", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPAvg(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPAvg_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPTo", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPTo(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPTo_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPWgFrom", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPWgFrom(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPWgFrom_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPWgAvg", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPWgAvg(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPWgAvg_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "UPWgTo", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemUPWgTo(BigDecimal value) {
        return new JAXBElement<>(_TgItemUPWgTo_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "IT", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemIT(BigDecimal value) {
        return new JAXBElement<>(_TgItemIT_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "VAT", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemVAT(BigDecimal value) {
        return new JAXBElement<>(_TgItemVAT_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgPriceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgPriceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PriceInfo", scope = TgItem.class)
    public JAXBElement<TgPriceInfo> createTgItemPriceInfo(TgPriceInfo value) {
        return new JAXBElement<>(_TgItemPriceInfo_QNAME, TgPriceInfo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TimeQu", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemTimeQu(BigDecimal value) {
        return new JAXBElement<>(_TgItemTimeQu_QNAME, BigDecimal.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgDescription }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Description", scope = TgItem.class)
    public JAXBElement<TgDescription> createTgItemDescription(TgDescription value) {
        return new JAXBElement<>(_TgItemDescription_QNAME, TgDescription.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgMLText }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgMLText }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BidComm", scope = TgItem.class)
    public JAXBElement<TgMLText> createTgItemBidComm(TgMLText value) {
        return new JAXBElement<>(_TgItemBidComm_QNAME, TgMLText.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SumDescr", scope = TgItem.class)
    public JAXBElement<TgYes> createTgItemSumDescr(TgYes value) {
        return new JAXBElement<>(_TgItemSumDescr_QNAME, TgYes.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgSubDescr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgSubDescr }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SubDescr", scope = TgItem.class)
    public JAXBElement<TgSubDescr> createTgItemSubDescr(TgSubDescr value) {
        return new JAXBElement<>(_TgItemSubDescr_QNAME, TgSubDescr.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgProduct }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Product", scope = TgItem.class)
    public JAXBElement<TgProduct> createTgItemProduct(TgProduct value) {
        return new JAXBElement<>(_TgItemProduct_QNAME, TgProduct.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgAlterBidStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgAlterBidStatus }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AlterBidStatus", scope = TgItem.class)
    public JAXBElement<TgAlterBidStatus> createTgItemAlterBidStatus(TgAlterBidStatus value) {
        return new JAXBElement<>(_TgItemAlterBidStatus_QNAME, TgAlterBidStatus.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCostApproach }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCostApproach }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CostApproach", scope = TgItem.class)
    public JAXBElement<TgCostApproach> createTgItemCostApproach(TgCostApproach value) {
        return new JAXBElement<>(_TgItemCostApproach_QNAME, TgCostApproach.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgCheckNote }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgCheckNote }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CheckNote", scope = TgItem.class)
    public JAXBElement<TgCheckNote> createTgItemCheckNote(TgCheckNote value) {
        return new JAXBElement<>(_TgItemCheckNote_QNAME, TgCheckNote.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgQtyDeterm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgQtyDeterm }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "QtyDeterm", scope = TgItem.class)
    public JAXBElement<TgQtyDeterm> createTgItemQtyDeterm(TgQtyDeterm value) {
        return new JAXBElement<>(_TgItemQtyDeterm_QNAME, TgQtyDeterm.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BidUpDownReq", scope = TgItem.class)
    public JAXBElement<TgYesNo> createTgItemBidUpDownReq(TgYesNo value) {
        return new JAXBElement<>(_TgItemBidUpDownReq_QNAME, TgYesNo.class, TgItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BidUpDownPct", scope = TgItem.class)
    public JAXBElement<BigDecimal> createTgItemBidUpDownPct(BigDecimal value) {
        return new JAXBElement<>(_TgItemBidUpDownPct_QNAME, BigDecimal.class, TgItem.class, value);
    }

}
