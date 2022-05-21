
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Item details
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Item)
public class Item
    extends LogisticsObject
    implements Serializable
{

    /**
     * Dimensions of the item
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_dimensions)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Dimensions dimensions;
    /**
     * URI of the PIECE that contains the Item
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_isInPiece)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Piece isInPiece;
    /**
     * Other identifier details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_otherIdentifiers_A)
    protected Set<OtherIdentifier> otherIdentifiers;
    /**
     * URI of the product
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_product_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Product product;
    /**
     * Production country details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_productionCountry)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Country productionCountry;
    /**
     * Quantity of the item when applicable, witth associated units of measure
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_quantity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Value quantity;
    /**
     * Item target country
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_targetCountry)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Country targetCountry;
    /**
     * Product price per unit in the base
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_unitPrice)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Value unitPrice;
    /**
     * Weight of the item
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_weight)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Value weight;
    /**
     * Production batch number / reference
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_batchNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String batchNumber;
    /**
     * Production lot number / reference
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_lotNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String lotNumber;
    /**
     * Product expiry date - e.g. for perishables goods or goods with programmed obsolescence
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productExpiryDate)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected Date productExpiryDate;
    /**
     * Production date
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_productionDate)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected Date productionDate;
    /**
     * Product quantity for unit price - e.g. 12 (eggs for one USD 1)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_quantityForUnitPrice)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#double", max = 1)
    })
    protected Double quantityForUnitPrice;

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setIsInPiece(Piece isInPiece) {
        this.isInPiece = isInPiece;
    }

    public Piece getIsInPiece() {
        return isInPiece;
    }

    public void setOtherIdentifiers(Set<OtherIdentifier> otherIdentifiers) {
        this.otherIdentifiers = otherIdentifiers;
    }

    public Set<OtherIdentifier> getOtherIdentifiers() {
        return otherIdentifiers;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProductionCountry(Country productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Country getProductionCountry() {
        return productionCountry;
    }

    public void setQuantity(Value quantity) {
        this.quantity = quantity;
    }

    public Value getQuantity() {
        return quantity;
    }

    public void setTargetCountry(Country targetCountry) {
        this.targetCountry = targetCountry;
    }

    public Country getTargetCountry() {
        return targetCountry;
    }

    public void setUnitPrice(Value unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Value getUnitPrice() {
        return unitPrice;
    }

    public void setWeight(Value weight) {
        this.weight = weight;
    }

    public Value getWeight() {
        return weight;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setProductExpiryDate(Date productExpiryDate) {
        this.productExpiryDate = productExpiryDate;
    }

    public Date getProductExpiryDate() {
        return productExpiryDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setQuantityForUnitPrice(Double quantityForUnitPrice) {
        this.quantityForUnitPrice = quantityForUnitPrice;
    }

    public Double getQuantityForUnitPrice() {
        return quantityForUnitPrice;
    }

}