/**
 */
package extractedMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extractedMM.ExtractedMMPackage
 * @generated
 */
public interface ExtractedMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtractedMMFactory eINSTANCE = extractedMM.impl.ExtractedMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net Element</em>'.
	 * @generated
	 */
	NetElement createNetElement();

	/**
	 * Returns a new object of class '<em>Positioning Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positioning Net Element</em>'.
	 * @generated
	 */
	PositioningNetElement createPositioningNetElement();

	/**
	 * Returns a new object of class '<em>Linear Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Element</em>'.
	 * @generated
	 */
	LinearElement createLinearElement();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Positioned Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positioned Relation</em>'.
	 * @generated
	 */
	PositionedRelation createPositionedRelation();

	/**
	 * Returns a new object of class '<em>Spot Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spot Location</em>'.
	 * @generated
	 */
	SpotLocation createSpotLocation();

	/**
	 * Returns a new object of class '<em>Linear Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Location</em>'.
	 * @generated
	 */
	LinearLocation createLinearLocation();

	/**
	 * Returns a new object of class '<em>Area Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Location</em>'.
	 * @generated
	 */
	AreaLocation createAreaLocation();

	/**
	 * Returns a new object of class '<em>Associated Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associated Net Element</em>'.
	 * @generated
	 */
	AssociatedNetElement createAssociatedNetElement();

	/**
	 * Returns a new object of class '<em>Lateral Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lateral Position</em>'.
	 * @generated
	 */
	LateralPosition createLateralPosition();

	/**
	 * Returns a new object of class '<em>Tvp Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tvp Section</em>'.
	 * @generated
	 */
	TvpSection createTvpSection();

	/**
	 * Returns a new object of class '<em>Tds Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tds Section</em>'.
	 * @generated
	 */
	TdsSection createTdsSection();

	/**
	 * Returns a new object of class '<em>Tds Compnent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tds Compnent</em>'.
	 * @generated
	 */
	TdsCompnent createTdsCompnent();

	/**
	 * Returns a new object of class '<em>Vss Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vss Limit</em>'.
	 * @generated
	 */
	VssLimit createVssLimit();

	/**
	 * Returns a new object of class '<em>Virtual Sub Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Sub Section</em>'.
	 * @generated
	 */
	VirtualSubSection createVirtualSubSection();

	/**
	 * Returns a new object of class '<em>Etcs Ma Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etcs Ma Section</em>'.
	 * @generated
	 */
	EtcsMaSection createEtcsMaSection();

	/**
	 * Returns a new object of class '<em>Etcs Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etcs Route</em>'.
	 * @generated
	 */
	EtcsRoute createEtcsRoute();

	/**
	 * Returns a new object of class '<em>Route Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Body</em>'.
	 * @generated
	 */
	RouteBody createRouteBody();

	/**
	 * Returns a new object of class '<em>Section List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section List</em>'.
	 * @generated
	 */
	SectionList createSectionList();

	/**
	 * Returns a new object of class '<em>Route Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Entry</em>'.
	 * @generated
	 */
	RouteEntry createRouteEntry();

	/**
	 * Returns a new object of class '<em>Route Exit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Exit</em>'.
	 * @generated
	 */
	RouteExit createRouteExit();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>Non Physical Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Physical Signal</em>'.
	 * @generated
	 */
	NonPhysicalSignal createNonPhysicalSignal();

	/**
	 * Returns a new object of class '<em>Virtual Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Signal</em>'.
	 * @generated
	 */
	VirtualSignal createVirtualSignal();

	/**
	 * Returns a new object of class '<em>Net Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net Entity</em>'.
	 * @generated
	 */
	NetEntity createNetEntity();

	/**
	 * Returns a new object of class '<em>Signal RSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal RSM</em>'.
	 * @generated
	 */
	SignalRSM createSignalRSM();

	/**
	 * Returns a new object of class '<em>Route Body RSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Body RSM</em>'.
	 * @generated
	 */
	RouteBodyRSM createRouteBodyRSM();

	/**
	 * Returns a new object of class '<em>Etcs Signal Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etcs Signal Properties</em>'.
	 * @generated
	 */
	EtcsSignalProperties createEtcsSignalProperties();

	/**
	 * Returns a new object of class '<em>Etcs End Of Authority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etcs End Of Authority</em>'.
	 * @generated
	 */
	EtcsEndOfAuthority createEtcsEndOfAuthority();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Data Prep Entities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Prep Entities</em>'.
	 * @generated
	 */
	DataPrepEntities createDataPrepEntities();

	/**
	 * Returns a new object of class '<em>Rsm Entities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rsm Entities</em>'.
	 * @generated
	 */
	RsmEntities createRsmEntities();

	/**
	 * Returns a new object of class '<em>Topology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology</em>'.
	 * @generated
	 */
	Topology createTopology();

	/**
	 * Returns a new object of class '<em>Section And Vacancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section And Vacancy</em>'.
	 * @generated
	 */
	SectionAndVacancy createSectionAndVacancy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtractedMMPackage getExtractedMMPackage();

} //ExtractedMMFactory
