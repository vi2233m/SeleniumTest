package datas.inbound;

import sun.security.util.Length;

/**
 * 创建入库单所需数据 javabean
 */
public class InboundAddData {
    private String product = "OW01010343"; //WINIT产品编码
    private String customerOrderNo = "123345"; //客户订单号
    private String inspectionWH = "SZ0001"; //验货仓
    private String destinationWH = "US0001"; //目的仓
    private String caseNo = "12345"; //箱单号
    private String weight = "1";  //包裹重量
    private String length ="11";  //包裹长
    private String width ="11";   //包裹宽
    private String height ="11";  //包裹高
    private String skuCode ="auto_sku22";//商品编码
    private String skuQuantity ="1"; //商品数量
    private String exporterCode ="TEOR";//出口商
    private String importRules ="TIOR";//进口报关规则
    private String inspectionType ="WI"; //验货方式
    private String pickupType ="S"; //提货类型
    private String supplier ="LB"; //发货供应商
    private String expressNo ="12345"; //快递单号

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCustomerOrderNo() {
        return customerOrderNo;
    }

    public void setCustomerOrderNo(String customerOrderNo) {
        this.customerOrderNo = customerOrderNo;
    }

    public String getInspectionWH() {
        return inspectionWH;
    }

    public void setInspectionWH(String inspectionWH) {
        this.inspectionWH = inspectionWH;
    }

    public String getDestinationWH() {
        return destinationWH;
    }

    public void setDestinationWH(String destinationWH) {
        this.destinationWH = destinationWH;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuQuantity() {
        return skuQuantity;
    }

    public void setSkuQuantity(String skuQuantity) {
        this.skuQuantity = skuQuantity;
    }

    /**
     * 出库商编码
     * @return
     */
    public String getExporterCode() {
        return exporterCode;
    }

    public void setExporterCode(String exporterCode) {
        this.exporterCode = exporterCode;
    }

    public String getImportRules() {
        return importRules;
    }

    public void setImportRules(String importRules) {
        this.importRules = importRules;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
    }

    public String getPickupType() {
        return pickupType;
    }

    public void setPickupType(String pickupType) {
        this.pickupType = pickupType;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }
}
