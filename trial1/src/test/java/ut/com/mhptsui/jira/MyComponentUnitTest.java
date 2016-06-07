package ut.com.mhptsui.jira;

import org.junit.Test;
import com.mhptsui.jira.MyPluginComponent;
import com.mhptsui.jira.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}