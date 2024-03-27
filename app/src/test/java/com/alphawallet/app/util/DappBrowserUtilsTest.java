package com.alphawallet.app.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DappBrowserUtilsTest
{
    @Test
    public void testDefaultDapp()
    {
        assertThat(DappBrowserUtils.defaultDapp(1L), equalTo("https://thedapplist.com/"));
        assertThat(DappBrowserUtils.defaultDapp(137L), equalTo("https://thedapplist.com/"));
        assertThat(DappBrowserUtils.defaultDapp(80001L), equalTo("https://thedapplist.com/"));
    }

    @Test
    public void testIsDefaultDapp()
    {
        assertTrue(DappBrowserUtils.isDefaultDapp("https://thedapplist.com/"));
        assertTrue(DappBrowserUtils.isDefaultDapp("https://thedapplist.com/"));
        assertFalse(DappBrowserUtils.isDefaultDapp("https://thedapplist.com/"));
    }

    @Test
    public void testIsWithinHomePage()
    {
        assertTrue(DappBrowserUtils.isWithinHomePage("https://thedapplist.com/"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://thedapplist.com/"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://thedapplist.com/"));
        assertFalse(DappBrowserUtils.isWithinHomePage("https://thedapplist.com/"));
    }
}
