package es.upm.dit.cnvr.distributedBank;

public  class ConfigurationParameters {
	public static int  CLUSTER_GOAL_SIZE = 3;
	public static int CLUSTER_WATCHDOG_SLEEP_CYCLE = 5000; //millis
	// This value is not taken into account, the cluster uses its own timeout
	public static int ZOOKEEPER_SESSION_TIMEOUT = 4000;
	public static String ZOOKEEPER_TREE_SEPARATOR = "-";
	public static String ZOOKEEPER_TREE_LOCKS_ROOT = "/locks";
	public static String ZOOKEEPER_TREE_LOCKS_PREFIX = "/lock" + ZOOKEEPER_TREE_SEPARATOR;
	public static String ZOOKEEPER_TREE_LOCKS_PREFIX_NO_SLASH = "lock" + ZOOKEEPER_TREE_SEPARATOR;
	public static String ZOOKEEPER_TREE_MEMBERS_ROOT = "/members";
	public static String ZOOKEEPER_TREE_MEMBERS_PREFIX = "/member" + ZOOKEEPER_TREE_SEPARATOR;
	public static String ZOOKEEPER_TREE_MEMBERS_PREFIX_NO_SLASH = "member" + ZOOKEEPER_TREE_SEPARATOR;
	public static String ZOOKEEPER_TREE_STATE_PREFIX = "/state" + ZOOKEEPER_TREE_SEPARATOR;
	public static String ZOOKEEPER_TREE_OPERATIONS_ROOT = "/operations";
	public static String ZOOKEEPER_TREE_STATE_ROOT = "/state"; 
	public static String ZOOKEEPER_TREE_STATE_PATH = "/state/dbDump"; 
	public static String PROJECT_MAIN_PATH = "es.upm.dit.cnvr.distributedBank";
	public static String PROJECT_WORKING_DIRECTORY = "";
	public static String PROJECT_START_SCRIPT = "start.sh";
	public static String HOST_IP_ADDRESS = "";
	// - macOS
	public static String[] SERVER_CREATION_MAC = new String[] {"open","-a","Terminal", ""};
	public static String MACOS_NETWORK_INTERFACE_NAME = "en0";
	// - Linux
	public static String[] SERVER_CREATION_LINUX = new String[] {"gnome-terminal","-x","sh", "-c", ""};
	public static String LINUX_NETWORK_INTERFACE_NAME_1 = "wlp5s0";
	public static String LINUX_NETWORK_INTERFACE_NAME_2 = "enp0s3";
	
}
