/**
 */
package eTCSData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kind Of Trains</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eTCSData.ETCSDataPackage#getKindOfTrains()
 * @model
 * @generated
 */
public enum KindOfTrains implements Enumerator {
	/**
	 * The '<em><b>TIMSERTMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMSERTMS_VALUE
	 * @generated
	 * @ordered
	 */
	TIMSERTMS(0, "TIMSERTMS", "TIMSERTMS"),

	/**
	 * The '<em><b>ERTMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERTMS_VALUE
	 * @generated
	 * @ordered
	 */
	ERTMS(1, "ERTMS", "ERTMS"),

	/**
	 * The '<em><b>No ERTMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ERTMS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ERTMS(2, "NoERTMS", "NoERTMS");

	/**
	 * The '<em><b>TIMSERTMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMSERTMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMSERTMS_VALUE = 0;

	/**
	 * The '<em><b>ERTMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERTMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERTMS_VALUE = 1;

	/**
	 * The '<em><b>No ERTMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ERTMS
	 * @model name="NoERTMS"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ERTMS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Kind Of Trains</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KindOfTrains[] VALUES_ARRAY =
		new KindOfTrains[] {
			TIMSERTMS,
			ERTMS,
			NO_ERTMS,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind Of Trains</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KindOfTrains> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind Of Trains</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KindOfTrains get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KindOfTrains result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind Of Trains</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KindOfTrains getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KindOfTrains result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind Of Trains</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static KindOfTrains get(int value) {
		switch (value) {
			case TIMSERTMS_VALUE: return TIMSERTMS;
			case ERTMS_VALUE: return ERTMS;
			case NO_ERTMS_VALUE: return NO_ERTMS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private KindOfTrains(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //KindOfTrains
