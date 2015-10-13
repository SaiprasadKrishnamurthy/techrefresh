//package observerdesign.tests.model;
//
//import observerdesign.action.log.LogAction;
//import observerdesign.model.Registry;
//import observerdesign.trigger.FileKeywordTrigger;
//
///**
// * Created by sai on 13/10/2015.
// */
//public class RegistryTest {
//
//    public static final Registry REGISTRY_INSTANCE = Registry.getInstance();
//
//    @Test
//    public forceTrigger_should_forcetrigger() {
//        REGISTRY_INSTANCE
//                .register(new LogAction<FileKeywordTrigger>(), FileKeywordTrigger.class);
//        // Register the action for the trigger first.
//
//        REGISTRY_INSTANCE.forceTrigger(new FileKeywordTrigger("", "", 10));
//
//        // PErform the appropriate test
//
//    }
//
//    @Test(expected = UnsupportedOperationException.class)
//    public forceTrigger_should_error_when_no_action_registered() {
//        // Register the action for the trigger first.
//        REGISTRY_INSTANCE
//                .unregister(FileKeywordTrigger.class);
//
//        REGISTRY_INSTANCE.forceTrigger(new FileKeywordTrigger("", "", 10));
//
//
//    }
//
//}
