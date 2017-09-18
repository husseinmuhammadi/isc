package com.npci.financial.isc.model.converter.isc.product;

import com.npci.financial.isc.model.type.isc.product.ProductCode;

import javax.persistence.AttributeConverter;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public class ProductCodeConverter implements AttributeConverter<ProductCode, String> {
    @Override
    public String convertToDatabaseColumn(ProductCode productCode) {
        if (productCode != null)
            return productCode.getValue();

        return null;
    }

    @Override
    public ProductCode convertToEntityAttribute(String value) {
        return ProductCode.getInstance(value);
    }
}
