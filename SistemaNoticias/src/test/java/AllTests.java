import net.filippov.newsportal.domain.ArticleTest;
import net.filippov.newsportal.domain.UserTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.tests.WebTest;


@RunWith(Suite.class)
@SuiteClasses({ArticleTest.class,UserTest.class,WebTest.class})
public class AllTests {

}
