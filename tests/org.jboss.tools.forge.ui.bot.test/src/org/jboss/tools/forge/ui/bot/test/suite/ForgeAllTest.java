package org.jboss.tools.forge.ui.bot.test.suite;

import org.jboss.tools.forge.ui.bot.test.EntityTest;
import org.jboss.tools.forge.ui.bot.test.ForgeViewTest;
import org.jboss.tools.forge.ui.bot.test.PersistenceTest;
import org.jboss.tools.forge.ui.bot.test.ProjectTest;
import org.jboss.tools.ui.bot.ext.RequirementAwareSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


/**
 * 
 * @author psrna
 *
 */
@SuiteClasses({
	ForgeViewTest.class,
	ProjectTest.class,
	PersistenceTest.class,
	EntityTest.class
})
@RunWith(RequirementAwareSuite.class)
public class ForgeAllTest {

}
