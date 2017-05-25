package org.cap.bankapp.test;


import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ BankAppServiceTestCase.class, MyFirstTestClass.class, ParameterizedTestCase.class })
//@IncludeCategory({GoodTestCategory.class})
@ExcludeCategory({BadTestCategory.class})
public class MyCategory {

	
}
