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
public class BooleanColumnStatsData implements org.apache.thrift.TBase<BooleanColumnStatsData, BooleanColumnStatsData._Fields>, java.io.Serializable, Cloneable, Comparable<BooleanColumnStatsData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BooleanColumnStatsData");

  private static final org.apache.thrift.protocol.TField NUM_TRUES_FIELD_DESC = new org.apache.thrift.protocol.TField("numTrues", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_FALSES_FIELD_DESC = new org.apache.thrift.protocol.TField("numFalses", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_NULLS_FIELD_DESC = new org.apache.thrift.protocol.TField("numNulls", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BooleanColumnStatsDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BooleanColumnStatsDataTupleSchemeFactory());
  }

  private long numTrues; // required
  private long numFalses; // required
  private long numNulls; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_TRUES((short)1, "numTrues"),
    NUM_FALSES((short)2, "numFalses"),
    NUM_NULLS((short)3, "numNulls");

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
        case 1: // NUM_TRUES
          return NUM_TRUES;
        case 2: // NUM_FALSES
          return NUM_FALSES;
        case 3: // NUM_NULLS
          return NUM_NULLS;
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
  private static final int __NUMTRUES_ISSET_ID = 0;
  private static final int __NUMFALSES_ISSET_ID = 1;
  private static final int __NUMNULLS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_TRUES, new org.apache.thrift.meta_data.FieldMetaData("numTrues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_FALSES, new org.apache.thrift.meta_data.FieldMetaData("numFalses", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_NULLS, new org.apache.thrift.meta_data.FieldMetaData("numNulls", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BooleanColumnStatsData.class, metaDataMap);
  }

  public BooleanColumnStatsData() {
  }

  public BooleanColumnStatsData(
    long numTrues,
    long numFalses,
    long numNulls)
  {
    this();
    this.numTrues = numTrues;
    setNumTruesIsSet(true);
    this.numFalses = numFalses;
    setNumFalsesIsSet(true);
    this.numNulls = numNulls;
    setNumNullsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BooleanColumnStatsData(BooleanColumnStatsData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.numTrues = other.numTrues;
    this.numFalses = other.numFalses;
    this.numNulls = other.numNulls;
  }

  public BooleanColumnStatsData deepCopy() {
    return new BooleanColumnStatsData(this);
  }

  @Override
  public void clear() {
    setNumTruesIsSet(false);
    this.numTrues = 0;
    setNumFalsesIsSet(false);
    this.numFalses = 0;
    setNumNullsIsSet(false);
    this.numNulls = 0;
  }

  public long getNumTrues() {
    return this.numTrues;
  }

  public void setNumTrues(long numTrues) {
    this.numTrues = numTrues;
    setNumTruesIsSet(true);
  }

  public void unsetNumTrues() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMTRUES_ISSET_ID);
  }

  /** Returns true if field numTrues is set (has been assigned a value) and false otherwise */
  public boolean isSetNumTrues() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMTRUES_ISSET_ID);
  }

  public void setNumTruesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMTRUES_ISSET_ID, value);
  }

  public long getNumFalses() {
    return this.numFalses;
  }

  public void setNumFalses(long numFalses) {
    this.numFalses = numFalses;
    setNumFalsesIsSet(true);
  }

  public void unsetNumFalses() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMFALSES_ISSET_ID);
  }

  /** Returns true if field numFalses is set (has been assigned a value) and false otherwise */
  public boolean isSetNumFalses() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMFALSES_ISSET_ID);
  }

  public void setNumFalsesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMFALSES_ISSET_ID, value);
  }

  public long getNumNulls() {
    return this.numNulls;
  }

  public void setNumNulls(long numNulls) {
    this.numNulls = numNulls;
    setNumNullsIsSet(true);
  }

  public void unsetNumNulls() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMNULLS_ISSET_ID);
  }

  /** Returns true if field numNulls is set (has been assigned a value) and false otherwise */
  public boolean isSetNumNulls() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMNULLS_ISSET_ID);
  }

  public void setNumNullsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMNULLS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM_TRUES:
      if (value == null) {
        unsetNumTrues();
      } else {
        setNumTrues((Long)value);
      }
      break;

    case NUM_FALSES:
      if (value == null) {
        unsetNumFalses();
      } else {
        setNumFalses((Long)value);
      }
      break;

    case NUM_NULLS:
      if (value == null) {
        unsetNumNulls();
      } else {
        setNumNulls((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_TRUES:
      return Long.valueOf(getNumTrues());

    case NUM_FALSES:
      return Long.valueOf(getNumFalses());

    case NUM_NULLS:
      return Long.valueOf(getNumNulls());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM_TRUES:
      return isSetNumTrues();
    case NUM_FALSES:
      return isSetNumFalses();
    case NUM_NULLS:
      return isSetNumNulls();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BooleanColumnStatsData)
      return this.equals((BooleanColumnStatsData)that);
    return false;
  }

  public boolean equals(BooleanColumnStatsData that) {
    if (that == null)
      return false;

    boolean this_present_numTrues = true;
    boolean that_present_numTrues = true;
    if (this_present_numTrues || that_present_numTrues) {
      if (!(this_present_numTrues && that_present_numTrues))
        return false;
      if (this.numTrues != that.numTrues)
        return false;
    }

    boolean this_present_numFalses = true;
    boolean that_present_numFalses = true;
    if (this_present_numFalses || that_present_numFalses) {
      if (!(this_present_numFalses && that_present_numFalses))
        return false;
      if (this.numFalses != that.numFalses)
        return false;
    }

    boolean this_present_numNulls = true;
    boolean that_present_numNulls = true;
    if (this_present_numNulls || that_present_numNulls) {
      if (!(this_present_numNulls && that_present_numNulls))
        return false;
      if (this.numNulls != that.numNulls)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_numTrues = true;
    list.add(present_numTrues);
    if (present_numTrues)
      list.add(numTrues);

    boolean present_numFalses = true;
    list.add(present_numFalses);
    if (present_numFalses)
      list.add(numFalses);

    boolean present_numNulls = true;
    list.add(present_numNulls);
    if (present_numNulls)
      list.add(numNulls);

    return list.hashCode();
  }

  @Override
  public int compareTo(BooleanColumnStatsData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNumTrues()).compareTo(other.isSetNumTrues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumTrues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numTrues, other.numTrues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumFalses()).compareTo(other.isSetNumFalses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumFalses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numFalses, other.numFalses);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumNulls()).compareTo(other.isSetNumNulls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumNulls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numNulls, other.numNulls);
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
    StringBuilder sb = new StringBuilder("BooleanColumnStatsData(");
    boolean first = true;

    sb.append("numTrues:");
    sb.append(this.numTrues);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numFalses:");
    sb.append(this.numFalses);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numNulls:");
    sb.append(this.numNulls);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNumTrues()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'numTrues' is unset! Struct:" + toString());
    }

    if (!isSetNumFalses()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'numFalses' is unset! Struct:" + toString());
    }

    if (!isSetNumNulls()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'numNulls' is unset! Struct:" + toString());
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

  private static class BooleanColumnStatsDataStandardSchemeFactory implements SchemeFactory {
    public BooleanColumnStatsDataStandardScheme getScheme() {
      return new BooleanColumnStatsDataStandardScheme();
    }
  }

  private static class BooleanColumnStatsDataStandardScheme extends StandardScheme<BooleanColumnStatsData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BooleanColumnStatsData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_TRUES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.numTrues = iprot.readI64();
              struct.setNumTruesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_FALSES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.numFalses = iprot.readI64();
              struct.setNumFalsesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_NULLS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.numNulls = iprot.readI64();
              struct.setNumNullsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BooleanColumnStatsData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_TRUES_FIELD_DESC);
      oprot.writeI64(struct.numTrues);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_FALSES_FIELD_DESC);
      oprot.writeI64(struct.numFalses);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_NULLS_FIELD_DESC);
      oprot.writeI64(struct.numNulls);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BooleanColumnStatsDataTupleSchemeFactory implements SchemeFactory {
    public BooleanColumnStatsDataTupleScheme getScheme() {
      return new BooleanColumnStatsDataTupleScheme();
    }
  }

  private static class BooleanColumnStatsDataTupleScheme extends TupleScheme<BooleanColumnStatsData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BooleanColumnStatsData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.numTrues);
      oprot.writeI64(struct.numFalses);
      oprot.writeI64(struct.numNulls);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BooleanColumnStatsData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.numTrues = iprot.readI64();
      struct.setNumTruesIsSet(true);
      struct.numFalses = iprot.readI64();
      struct.setNumFalsesIsSet(true);
      struct.numNulls = iprot.readI64();
      struct.setNumNullsIsSet(true);
    }
  }

}

