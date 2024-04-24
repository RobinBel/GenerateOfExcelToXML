package co.bellota.generateofexceltoxml;

public class Product {
 
    private String itemCode = "";
    private String description = "";
    private String extraDescription = "";
    private String typeCode= "";
    private String classCode= "";
    private String stockingUOM= "";
    private String lotControlledInd= "";
    private String actualMaterialUpdateCode= "";
    private String taxCode= "";
    private String groupSalesAnalysisRef1= "";
    private String groupSalesAnalysisRef2= "";
    private String groupSalesAnalysisRef3= "";
    private String groupSalesAnalysisRef4= "";
    private String groupSalesAnalysisRef5= "";
    private String masterScheduledInd= "";
    private String leadTimeDays= "";
    private String firstDemandCode= "";
    private String secondDemandCode= "";
    private String minBalanceQty= "";
    private String MedidaLote= "";
    private String incrementalOrderQty= "";
    private String orderPolicy= "";
    private String controlDate2LeadTime= "";
    private String controlDate3LeadTime= "";
    private String controlDate4LeadTime= "";
    private String abcInventoryCode= "";
    private String purchasingUnitCode= "";
    private String sellingUOM= "";
    private String groupTechnologyCode= "";
    private String bracketGroupCode= "";
    private String primaryVendorCode= "";
    private String secondaryVendorCode= "";
    private String countryOfOriginCode= "";
    private String maxInventoryQty= "";
    private String horizonDays= "";
    private String requirementsCode= "";
    private String dailyLeadTimeRate= "";
    private String targetAnnualQty= "";
    private String minBalanceHorizonDays= "";
    private String DiasExistencia= "";
    private String secondaryGroupRef= "";
    private String packagingType= "";
    private String catalogNumberCode= "";
    private String pricingUOM= "";
    private String dropShipAllowedInd= "";
    private String controlDate5LeadTime= "";
    private String unitsPerPallet= "";
    private String netNetWeightPerUnit= "";
    private String weightPerUnit= "";
    private String weightUOM= "";
    private String length= "";
    private String lengthUOM= "";
    private String width= "";
    private String widthUOM= "";
    private String height= "";
    private String heightUOM= "";
    private String drawingOrFormulaCode= "";

    public Product(){}

    public boolean selectCampo(String campo, String valor){
        //hacer un switch para seleccionar el campo
        switch (campo){
            case "itemCode":
                this.setItemCode(valor);
                return true;
            case "description":
                this.setDescription(valor);
                return true;
            case "extraDescription":
                this.setExtraDescription(valor);
                return true;
            case "typeCode":
                this.setTypeCode(valor);
                return true;
            case "classCode":
                this.setClassCode(valor);
                return true;
            case "stockingUOM":
                this.setStockingUOM(valor);
                return true;
            case "lotControlledInd":
                this.setLotControlledInd(valor);
                return true;
            case "actualMaterialUpdateCode":
                this.setActualMaterialUpdateCode(valor);
                return true;
            case "taxCode":
                this.setTaxCode(valor);
                return true;
            case "groupSalesAnalysisRef1":
                this.setGroupSalesAnalysisRef1(valor);
                return true;
            case "groupSalesAnalysisRef2":
                this.setGroupSalesAnalysisRef2(valor);
                return true;
            case "groupSalesAnalysisRef3":
                this.setGroupSalesAnalysisRef3(valor);
                return true;
            case "groupSalesAnalysisRef4":
                this.setGroupSalesAnalysisRef4(valor);
                return true;
            case "groupSalesAnalysisRef5":
                this.setGroupSalesAnalysisRef5(valor);
                return true;
            case "masterScheduledInd":
                this.setMasterScheduledInd(valor);
                return true;
            case "leadTimeDays":
                this.setLeadTimeDays(valor);
                return true;
            case "firstDemandCode":
                this.setFirstDemandCode(valor);
                return true;
            case "secondDemandCode":
                this.setSecondDemandCode(valor);
                return true;
            case "minBalanceQty":
                this.setMinBalanceQty(valor);
                return true;
            case "MedidaLote":
                this.setMedidaLote(valor);
                return true;
            case "incrementalOrderQty":
                this.setIncrementalOrderQty(valor);
                return true;
            case "orderPolicy":
                this.setOrderPolicy(valor);
                return true;
            case "controlDate2LeadTime":
                this.setControlDate2LeadTime(valor);
                return true;
            case "controlDate3LeadTime":
                this.setControlDate3LeadTime(valor);
                return true;
            case "controlDate4LeadTime":
                this.setControlDate4LeadTime(valor);
                return true;
            case "abcInventoryCode":
                this.setAbcInventoryCode(valor);
                return true;
            case "purchasingUnitCode":
                this.setPurchasingUnitCode(valor);
                return true;
            case "sellingUOM":
                this.setSellingUOM(valor);
                return true;
            case "groupTechnologyCode":
                this.setGroupTechnologyCode(valor);
                return true;
            case "bracketGroupCode":
                this.setBracketGroupCode(valor);
                return true;
            case "primaryVendorCode":
                this.setPrimaryVendorCode(valor);
                return true;
            case "secondaryVendorCode":

                this.setSecondaryVendorCode(valor);
                return true;
            case "countryOfOriginCode":
                this.setCountryOfOriginCode(valor);
                return true;
            case "maxInventoryQty":
                this.setMaxInventoryQty(valor);
                return true;
            case "horizonDays":
                this.setHorizonDays(valor);
                return true;
            case "requirementsCode":
                this.setRequirementsCode(valor);
                return true;
            case "dailyLeadTimeRate":
                this.setDailyLeadTimeRate(valor);
                return true;
            case "targetAnnualQty":
                this.setTargetAnnualQty(valor);
                return true;
            case "minBalanceHorizonDays":
                this.setMinBalanceHorizonDays(valor);
                return true;
            case "DiasExistencia":
                this.setDiasExistencia(valor);
                return true;
            case "secondaryGroupRef":
                this.setSecondaryGroupRef(valor);
                return true;
            case "packagingType":
                this.setPackagingType(valor);
                return true;
            case "catalogNumberCode":
                this.setCatalogNumberCode(valor);
                return true;
            case "pricingUOM":
                this.setPricingUOM(valor);
                return true;
            case "dropShipAllowedInd":
                this.setDropShipAllowedInd(valor);
                return true;
            case "controlDate5LeadTime":
                this.setControlDate5LeadTime(valor);
                return true;
            case "unitsPerPallet":
                this.setUnitsPerPallet(valor);
                return true;
            case "netNetWeightPerUnit":
                this.setNetNetWeightPerUnit(valor);
                return true;
            case "weightPerUnit":
                this.setWeightPerUnit(valor);
                return true;
            case "weightUOM":
                this.setWeightUOM(valor);
                return true;
            case "length":
                this.setLength(valor);
                return true;
            case "lengthUOM":
                this.setLengthUOM(valor);
                return true;
            case "width":
                this.setWidth(valor);
                return true;
            case "widthUOM":
                this.setWidthUOM(valor);
                return true;
            case "height":
                this.setHeight(valor);
                return true;
            case "heightUOM":
                this.setHeightUOM(valor);
                return true;
            case "drawingOrFormulaCode":
                this.setDrawingOrFormulaCode(valor);
                return true;
            default:
                return false;
        }
    }

    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getExtraDescription() {
        return extraDescription;
    }
    public void setExtraDescription(String extraDescription) {
        this.extraDescription = extraDescription;
    }
    public String getTypeCode() {
        return typeCode;
    }
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
    public String getClassCode() {
        return classCode;
    }
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
    public String getStockingUOM() {
        return stockingUOM;
    }
    public void setStockingUOM(String stockingUOM) {
        this.stockingUOM = stockingUOM;
    }
    public String getLotControlledInd() {
        return lotControlledInd;
    }
    public void setLotControlledInd(String lotControlledInd) {
        this.lotControlledInd = lotControlledInd;
    }
    public String getActualMaterialUpdateCode() {
        return actualMaterialUpdateCode;
    }
    public void setActualMaterialUpdateCode(String actualMaterialUpdateCode) {
        this.actualMaterialUpdateCode = actualMaterialUpdateCode;
    }
    public String getTaxCode() {
        return taxCode;
    }
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
    public String getGroupSalesAnalysisRef1() {
        return groupSalesAnalysisRef1;
    }
    public void setGroupSalesAnalysisRef1(String groupSalesAnalysisRef1) {
        this.groupSalesAnalysisRef1 = groupSalesAnalysisRef1;
    }
    public String getGroupSalesAnalysisRef2() {
        return groupSalesAnalysisRef2;
    }
    public void setGroupSalesAnalysisRef2(String groupSalesAnalysisRef2) {
        this.groupSalesAnalysisRef2 = groupSalesAnalysisRef2;
    }
    public String getGroupSalesAnalysisRef3() {
        return groupSalesAnalysisRef3;
    }
    public void setGroupSalesAnalysisRef3(String groupSalesAnalysisRef3) {
        this.groupSalesAnalysisRef3 = groupSalesAnalysisRef3;
    }
    public String getGroupSalesAnalysisRef4() {
        return groupSalesAnalysisRef4;
    }
    public void setGroupSalesAnalysisRef4(String groupSalesAnalysisRef4) {
        this.groupSalesAnalysisRef4 = groupSalesAnalysisRef4;
    }
    public String getGroupSalesAnalysisRef5() {
        return groupSalesAnalysisRef5;
    }
    public void setGroupSalesAnalysisRef5(String groupSalesAnalysisRef5) {
        this.groupSalesAnalysisRef5 = groupSalesAnalysisRef5;
    }
    public String getMasterScheduledInd() {
        return masterScheduledInd;
    }
    public void setMasterScheduledInd(String masterScheduledInd) {
        this.masterScheduledInd = masterScheduledInd;
    }
    public String getLeadTimeDays() {
        return leadTimeDays;
    }
    public void setLeadTimeDays(String leadTimeDays) {
        this.leadTimeDays = leadTimeDays;
    }
    public String getFirstDemandCode() {
        return firstDemandCode;
    }
    public void setFirstDemandCode(String firstDemandCode) {
        this.firstDemandCode = firstDemandCode;
    }
    public String getSecondDemandCode() {
        return secondDemandCode;
    }
    public void setSecondDemandCode(String secondDemandCode) {
        this.secondDemandCode = secondDemandCode;
    }
    public String getMinBalanceQty() {
        return minBalanceQty;
    }
    public void setMinBalanceQty(String minBalanceQty) {
        this.minBalanceQty = minBalanceQty;
    }
    public String getMedidaLote() {
        return MedidaLote;
    }
    public void setMedidaLote(String MedidaLote) {
        this.MedidaLote = MedidaLote;
    }
    public String getIncrementalOrderQty() {
        return incrementalOrderQty;
    }
    public void setIncrementalOrderQty(String incrementalOrderQty) {
        this.incrementalOrderQty = incrementalOrderQty;
    }
    public String getOrderPolicy() {
        return orderPolicy;
    }
    public void setOrderPolicy(String orderPolicy) {
        this.orderPolicy = orderPolicy;
    }
    public String getControlDate2LeadTime() {
        return controlDate2LeadTime;
    }
    public void setControlDate2LeadTime(String controlDate2LeadTime) {
        this.controlDate2LeadTime = controlDate2LeadTime;
    }
    public String getControlDate3LeadTime() {
        return controlDate3LeadTime;
    }
    public void setControlDate3LeadTime(String controlDate3LeadTime) {
        this.controlDate3LeadTime = controlDate3LeadTime;
    }
    public String getControlDate4LeadTime() {
        return controlDate4LeadTime;
    }
    public void setControlDate4LeadTime(String controlDate4LeadTime) {
        this.controlDate4LeadTime = controlDate4LeadTime;
    }
    public String getAbcInventoryCode() {
        return abcInventoryCode;
    }
    public void setAbcInventoryCode(String abcInventoryCode) {
        this.abcInventoryCode = abcInventoryCode;
    }
    public String getPurchasingUnitCode() {
        return purchasingUnitCode;
    }
    public void setPurchasingUnitCode(String purchasingUnitCode) {
        this.purchasingUnitCode = purchasingUnitCode;
    }
    public String getSellingUOM() {
        return sellingUOM;
    }
    public void setSellingUOM(String sellingUOM) {
        this.sellingUOM = sellingUOM;
    }
    public String getGroupTechnologyCode() {
        return groupTechnologyCode;
    }
    public void setGroupTechnologyCode(String groupTechnologyCode) {
        this.groupTechnologyCode = groupTechnologyCode;
    }
    public String getBracketGroupCode() {
        return bracketGroupCode;
    }
    public void setBracketGroupCode(String bracketGroupCode) {
        this.bracketGroupCode = bracketGroupCode;
    }
    public String getPrimaryVendorCode() {
        return primaryVendorCode;
    }
    public void setPrimaryVendorCode(String primaryVendorCode) {
        this.primaryVendorCode = primaryVendorCode;
    }
    public String getSecondaryVendorCode() {
        return secondaryVendorCode;
    }
    public void setSecondaryVendorCode(String secondaryVendorCode) {
        this.secondaryVendorCode = secondaryVendorCode;
    }
    public String getCountryOfOriginCode() {
        return countryOfOriginCode;
    }
    public void setCountryOfOriginCode(String countryOfOriginCode) {
        this.countryOfOriginCode = countryOfOriginCode;
    }
    public String getMaxInventoryQty() {
        return maxInventoryQty;
    }
    public void setMaxInventoryQty(String maxInventoryQty) {
        this.maxInventoryQty = maxInventoryQty;
    }
    public String getHorizonDays() {
        return horizonDays;
    }
    public void setHorizonDays(String horizonDays) {
        this.horizonDays = horizonDays;
    }
    public String getRequirementsCode() {
        return requirementsCode;
    }
    public void setRequirementsCode(String requirementsCode) {
        this.requirementsCode = requirementsCode;
    }
    public String getDailyLeadTimeRate() {
        return dailyLeadTimeRate;
    }
    public void setDailyLeadTimeRate(String dailyLeadTimeRate) {
        this.dailyLeadTimeRate = dailyLeadTimeRate;
    }
    public String getTargetAnnualQty() {
        return targetAnnualQty;
    }
    public void setTargetAnnualQty(String targetAnnualQty) {
        this.targetAnnualQty = targetAnnualQty;
    }
    public String getMinBalanceHorizonDays() {
        return minBalanceHorizonDays;
    }
    public void setMinBalanceHorizonDays(String minBalanceHorizonDays) {
        this.minBalanceHorizonDays = minBalanceHorizonDays;
    }
    public String getDiasExistencia() {
        return DiasExistencia;
    }
    public void setDiasExistencia(String DiasExistencia) {
        this.DiasExistencia = DiasExistencia;
    }
    public String getSecondaryGroupRef() {
        return secondaryGroupRef;
    }
    public void setSecondaryGroupRef(String secondaryGroupRef) {
        this.secondaryGroupRef = secondaryGroupRef;
    }
    public String getPackagingType() {
        return packagingType;
    }
    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }
    public String getCatalogNumberCode() {
        return catalogNumberCode;
    }
    public void setCatalogNumberCode(String catalogNumberCode) {
        this.catalogNumberCode = catalogNumberCode;
    }
    public String getPricingUOM() {
        return pricingUOM;
    }
    public void setPricingUOM(String pricingUOM) {
        this.pricingUOM = pricingUOM;
    }
    public String getDropShipAllowedInd() {
        return dropShipAllowedInd;
    }
    public void setDropShipAllowedInd(String dropShipAllowedInd) {
        this.dropShipAllowedInd = dropShipAllowedInd;
    }
    public String getControlDate5LeadTime() {
        return controlDate5LeadTime;
    }
    public void setControlDate5LeadTime(String controlDate5LeadTime) {
        this.controlDate5LeadTime = controlDate5LeadTime;
    }
    public String getUnitsPerPallet() {
        return unitsPerPallet;
    }
    public void setUnitsPerPallet(String unitsPerPallet) {
        this.unitsPerPallet = unitsPerPallet;
    }
    public String getNetNetWeightPerUnit() {
        return netNetWeightPerUnit;
    }
    public void setNetNetWeightPerUnit(String netNetWeightPerUnit) {
        this.netNetWeightPerUnit = netNetWeightPerUnit;
    }
    public String getWeightPerUnit() {
        return weightPerUnit;
    }
    public void setWeightPerUnit(String weightPerUnit) {
        this.weightPerUnit = weightPerUnit;
    }
    public String getWeightUOM() {
        return weightUOM;
    }
    public void setWeightUOM(String weightUOM) {
        this.weightUOM = weightUOM;
    }
    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }
    public String getLengthUOM() {
        return lengthUOM;
    }
    public void setLengthUOM(String lengthUOM) {
        this.lengthUOM = lengthUOM;
    }
    public String getWidth() {
        return width;
    }
    public void setWidth(String width) {
        this.width = width;
    }
    public String getWidthUOM() {
        return widthUOM;
    }
    public void setWidthUOM(String widthUOM) {
        this.widthUOM = widthUOM;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getHeightUOM() {
        return heightUOM;
    }
    public void setHeightUOM(String heightUOM) {
        this.heightUOM = heightUOM;
    }
    public String getDrawingOrFormulaCode() {
        return drawingOrFormulaCode;
    }
    public void setDrawingOrFormulaCode(String drawingOrFormulaCode) {
        this.drawingOrFormulaCode = drawingOrFormulaCode;
    }


  
    
}
