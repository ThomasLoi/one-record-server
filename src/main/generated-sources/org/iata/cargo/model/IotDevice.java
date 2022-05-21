
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * IoT Device details
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_IotDevice)
public class IotDevice
    extends LogisticsObject
    implements Serializable
{

    /**
     * Manufacturer of the device
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_deviceManufacturer)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Company deviceManufacturer;
    /**
     * Reference to the sensors linked to the device
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_sensors)
    protected Set<Sensor> sensors;
    /**
     * Reference of the Logistic Object to which the Connected Device is linked (URI)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_associatedObject)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String associatedObject;
    /**
     * Natural language description of the device. It can describe how and where the device is attached.
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_deviceDescription)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String deviceDescription;
    /**
     * Commercial denomination of the device
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_deviceModel)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String deviceModel;
    /**
     * Name of the device defined by the device's owner
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_deviceName)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String deviceName;
    /**
     * Serial number that allows to uniquely identify the device
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_deviceSerialNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String deviceSerialNumber;

    public void setDeviceManufacturer(Company deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    public Company getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setSensors(Set<Sensor> sensors) {
        this.sensors = sensors;
    }

    public Set<Sensor> getSensors() {
        return sensors;
    }

    public void setAssociatedObject(String associatedObject) {
        this.associatedObject = associatedObject;
    }

    public String getAssociatedObject() {
        return associatedObject;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

}