public class DateTimeUtil{
    public static class DateTimeUtilTest {

        @Test
        public void testGetCurrentDateTimeFormat() {
            String dateTime = DateTimeUtil.getCurrentDateTime();
            // Regular expression to match the format "yyyy-MM-dd HH:mm:ss"
            String regex = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";

            // Check if the returned string matches the date-time format
            assertTrue(dateTime.matches(regex), "The date-time format should be 'yyyy-MM-dd HH:mm:ss'");
        }
    }
}
