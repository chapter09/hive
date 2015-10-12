/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-5")
public class OpenTxnRequest implements org.apache.thrift.TBase<OpenTxnRequest, OpenTxnRequest._Fields>, java.io.Serializable, Cloneable, Comparable<OpenTxnRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OpenTxnRequest");

  private static final org.apache.thrift.protocol.TField NUM_TXNS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_txns", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HOSTNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostname", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OpenTxnRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OpenTxnRequestTupleSchemeFactory());
  }

  private int num_txns; // required
  private String user; // required
  private String hostname; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_TXNS((short)1, "num_txns"),
    USER((short)2, "user"),
    HOSTNAME((short)3, "hostname");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NUM_TXNS
          return NUM_TXNS;
        case 2: // USER
          return USER;
        case 3: // HOSTNAME
          return HOSTNAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUM_TXNS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_TXNS, new org.apache.thrift.meta_data.FieldMetaData("num_txns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOSTNAME, new org.apache.thrift.meta_data.FieldMetaData("hostname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OpenTxnRequest.class, metaDataMap);
  }

  public OpenTxnRequest() {
  }

  public OpenTxnRequest(
    int num_txns,
    String user,
    String hostname)
  {
    this();
    this.num_txns = num_txns;
    setNum_txnsIsSet(true);
    this.user = user;
    this.hostname = hostname;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OpenTxnRequest(OpenTxnRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num_txns = other.num_txns;
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetHostname()) {
      this.hostname = other.hostname;
    }
  }

  public OpenTxnRequest deepCopy() {
    return new OpenTxnRequest(this);
  }

  @Override
  public void clear() {
    setNum_txnsIsSet(false);
    this.num_txns = 0;
    this.user = null;
    this.hostname = null;
  }

  public int getNum_txns() {
    return this.num_txns;
  }

  public void setNum_txns(int num_txns) {
    this.num_txns = num_txns;
    setNum_txnsIsSet(true);
  }

  public void unsetNum_txns() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_TXNS_ISSET_ID);
  }

  /** Returns true if field num_txns is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_txns() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_TXNS_ISSET_ID);
  }

  public void setNum_txnsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_TXNS_ISSET_ID, value);
  }

  public String getUser() {
    return this.user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public String getHostname() {
    return this.hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public void unsetHostname() {
    this.hostname = null;
  }

  /** Returns true if field hostname is set (has been assigned a value) and false otherwise */
  public boolean isSetHostname() {
    return this.hostname != null;
  }

  public void setHostnameIsSet(boolean value) {
    if (!value) {
      this.hostname = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM_TXNS:
      if (value == null) {
        unsetNum_txns();
      } else {
        setNum_txns((Integer)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case HOSTNAME:
      if (value == null) {
        unsetHostname();
      } else {
        setHostname((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_TXNS:
      return Integer.valueOf(getNum_txns());

    case USER:
      return getUser();

    case HOSTNAME:
      return getHostname();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM_TXNS:
      return isSetNum_txns();
    case USER:
      return isSetUser();
    case HOSTNAME:
      return isSetHostname();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OpenTxnRequest)
      return this.equals((OpenTxnRequest)that);
    return false;
  }

  public boolean equals(OpenTxnRequest that) {
    if (that == null)
      return false;

    boolean this_present_num_txns = true;
    boolean that_present_num_txns = true;
    if (this_present_num_txns || that_present_num_txns) {
      if (!(this_present_num_txns && that_present_num_txns))
        return false;
      if (this.num_txns != that.num_txns)
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_hostname = true && this.isSetHostname();
    boolean that_present_hostname = true && that.isSetHostname();
    if (this_present_hostname || that_present_hostname) {
      if (!(this_present_hostname && that_present_hostname))
        return false;
      if (!this.hostname.equals(that.hostname))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_num_txns = true;
    list.add(present_num_txns);
    if (present_num_txns)
      list.add(num_txns);

    boolean present_user = true && (isSetUser());
    list.add(present_user);
    if (present_user)
      list.add(user);

    boolean present_hostname = true && (isSetHostname());
    list.add(present_hostname);
    if (present_hostname)
      list.add(hostname);

    return list.hashCode();
  }

  @Override
  public int compareTo(OpenTxnRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNum_txns()).compareTo(other.isSetNum_txns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_txns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_txns, other.num_txns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHostname()).compareTo(other.isSetHostname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostname, other.hostname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("OpenTxnRequest(");
    boolean first = true;

    sb.append("num_txns:");
    sb.append(this.num_txns);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hostname:");
    if (this.hostname == null) {
      sb.append("null");
    } else {
      sb.append(this.hostname);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNum_txns()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_txns' is unset! Struct:" + toString());
    }

    if (!isSetUser()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user' is unset! Struct:" + toString());
    }

    if (!isSetHostname()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hostname' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OpenTxnRequestStandardSchemeFactory implements SchemeFactory {
    public OpenTxnRequestStandardScheme getScheme() {
      return new OpenTxnRequestStandardScheme();
    }
  }

  private static class OpenTxnRequestStandardScheme extends StandardScheme<OpenTxnRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_TXNS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_txns = iprot.readI32();
              struct.setNum_txnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOSTNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostname = iprot.readString();
              struct.setHostnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_TXNS_FIELD_DESC);
      oprot.writeI32(struct.num_txns);
      oprot.writeFieldEnd();
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.hostname != null) {
        oprot.writeFieldBegin(HOSTNAME_FIELD_DESC);
        oprot.writeString(struct.hostname);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OpenTxnRequestTupleSchemeFactory implements SchemeFactory {
    public OpenTxnRequestTupleScheme getScheme() {
      return new OpenTxnRequestTupleScheme();
    }
  }

  private static class OpenTxnRequestTupleScheme extends TupleScheme<OpenTxnRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.num_txns);
      oprot.writeString(struct.user);
      oprot.writeString(struct.hostname);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OpenTxnRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.num_txns = iprot.readI32();
      struct.setNum_txnsIsSet(true);
      struct.user = iprot.readString();
      struct.setUserIsSet(true);
      struct.hostname = iprot.readString();
      struct.setHostnameIsSet(true);
    }
  }

}

