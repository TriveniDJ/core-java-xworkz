class GardanTester 
{
    public static void main(String flower[]) 
	{
        Gardan.addFlower("rose");
        Gardan.addFlower("jasmine");
        Gardan.addFlower("lotus");
        Gardan.addFlower("marigold");
        Gardan.addFlower("moonflower");
        Gardan.getAllFlower();

        Gardan.updateFlowerName("rose", "rossie");
        Gardan.getAllFlower();

        boolean deleteValue = Gardan.deleteFlower("lotus");
        System.out.println(deleteValue);
        Gardan.getAllFlowerPostDeletion();
    }
}