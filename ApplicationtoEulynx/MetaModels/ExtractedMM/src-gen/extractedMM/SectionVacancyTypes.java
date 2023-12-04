/**
 */
package extractedMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Section Vacancy Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see extractedMM.ExtractedMMPackage#getSectionVacancyTypes()
 * @model annotation="meeduse generated=''"
 * @generated
 */
public enum SectionVacancyTypes implements Enumerator {
	/**
	 * The '<em><b>Eoccupied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EOCCUPIED_VALUE
	 * @generated
	 * @ordered
	 */
	EOCCUPIED(0, "E_occupied", "E_occupied"),
	/**
	 * The '<em><b>Evacant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #EVACANT_VALUE
	 * @generated
	 * @ordered
	 */
	EVACANT(1, "E_vacant", "E_vacant"),
	/**
	 * The '<em><b>Eambigious</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #EAMBIGIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	EAMBIGIOUS(2, "E_ambigious", "E_ambigious"),
	/**
	 * The '<em><b>Eunknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #EUNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	EUNKNOWN(3, "E_unknown", "E_unknown");

	/**
	 * The '<em><b>Eoccupied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EOCCUPIED
	 * @model name="E_occupied"
	 * @generated
	 * @ordered
	 */
	public static final int EOCCUPIED_VALUE = 0;

	/**
	 * The '<em><b>Evacant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVACANT
	 * @model name="E_vacant"
	 * @generated
	 * @ordered
	 */
	public static final int EVACANT_VALUE = 1;

	/**
	 * The '<em><b>Eambigious</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAMBIGIOUS
	 * @model name="E_ambigious"
	 * @generated
	 * @ordered
	 */
	public static final int EAMBIGIOUS_VALUE = 2;

	/**
	 * The '<em><b>Eunknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUNKNOWN
	 * @model name="E_unknown"
	 * @generated
	 * @ordered
	 */
	public static final int EUNKNOWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Section Vacancy Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SectionVacancyTypes[] VALUES_ARRAY = new SectionVacancyTypes[] { EOCCUPIED, EVACANT,
			EAMBIGIOUS, EUNKNOWN, };

	/**
	 * A public read-only list of all the '<em><b>Section Vacancy Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SectionVacancyTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Section Vacancy Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionVacancyTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionVacancyTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Vacancy Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionVacancyTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionVacancyTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Vacancy Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionVacancyTypes get(int value) {
		switch (value) {
		case EOCCUPIED_VALUE:
			return EOCCUPIED;
		case EVACANT_VALUE:
			return EVACANT;
		case EAMBIGIOUS_VALUE:
			return EAMBIGIOUS;
		case EUNKNOWN_VALUE:
			return EUNKNOWN;
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
	private SectionVacancyTypes(int value, String name, String literal) {
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

} //SectionVacancyTypes
