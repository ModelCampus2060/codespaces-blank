class OwnException extends Exception
{
    OwnException(String msg)
    {
        super(msg);
    }
    class Test
    {
        public static void main(String[] args) {
            int external=66;
            int internal=44;
            try{
                if (internal > 40 && external > 60)
                {
                throw new OwnException("Internal & External marks Exceed");
                }
                else if (internal > 40)
                {   
                throw new OwnException("Internal marks Exceed");
                }
                else if (external > 60)
                {
                throw new OwnException("External marks Exceed");
                }
            }
            catch(OwnException e)
            {
                System.out.println("Exception caught");
                System.out.println(e.getMessage());
            }
                finally{
                    System.out.println("End of Program");
                }
        }
    }
}