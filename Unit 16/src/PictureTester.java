/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate() {
	  Picture beach = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayScale() {
	  Picture beach = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/beach.jpg");
	  beach.explore();
	  beach.grayScale();
	  beach.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture beach = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/water.jpg");
	  beach.explore();
	  beach.fixUnderwater();
	  beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture p = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/caterpillar.jpg");
	  p.explore();
	  p.mirrorVerticalRightToLeft();
	  p.explore();
  }
  
  public static void testMirrorHorizontal() {
	  Picture p = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/redMotorcycle.jpg");
	  p.explore();
	  p.mirrorHorizontal();
	  p.explore();
  }
  
  public static void testMirrorHorizontalBotToTop() {
	  Picture p = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/jenny-red.jpg");
	  p.explore();
	  p.mirrorHorizontalBotToTop();
	  p.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture p = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/beach.jpg");
	  p.explore();
	  p.mirrorDiagonal();
	  p.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture p = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/snowman.jpg");
    p.explore();
    p.mirrorArms();
    p.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture p = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/seagull.jpg");
    p.explore();
    p.mirrorGull();
    p.explore();
  }
  
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy2()
  {
    Picture canvas = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testEncodeAndDecode()
  {
	  Picture original = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/temple.jpg");
	  original.explore();
	  
	  Picture hide = new Picture("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 16/src/images/msg.jpg");

	  original.encode(hide);
	  original.explore();
	  Picture msg1 = original.decode();
	  msg1.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
    //testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayScale();
//    testFixUnderwater();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
	//testCopy2();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}