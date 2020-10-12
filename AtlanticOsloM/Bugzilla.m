module Bugzilla {

	type ErrorType {"et_null", "et_NotFound", "et_NotPermitted", "et_InvalidBugId"};

	type SeverityType {"st_null", "st_blocker", "st_critical", "st_major", "st_normal", "st_minor", "st_trivial", "st_enhancement"};

	type StatusType {"st_null", "st_UNCONFIRMED", "st_NEW", "st_ASSIGNED", "st_REOPENED", "st_RESOLVED", "st_VERIFIED", "st_CLOSED"};

	type OperatingSystemType {"ost_null", "ost_all", "ost_Windows 3.1", "ost_Windows 95", "ost_Windows 98", "ost_Windows ME", "ost_Windows 2000", "ost_Windows NT", "ost_Windows XP", "ost_Windows Vista", "ost_Windows Server 2003", "ost_MacSystem 7", "ost_MacSystem 7.5", "ost_MacSystem 7.6.1", "ost_MacSystem 8.0", "ost_MacSystem 8.5", "ost_MacSystem 8.6", "ost_MacSystem 9.x", "ost_Mac OS X 10.0", "ost_Mac OS X 10.1", "ost_Mac OS X 10.2", "ost_Mac OS X 10.3", "ost_Linux", "ost_BDS/OS", "ost_FreeBSD", "ost_NetBSD", "ost_OpenBSD", "ost_AIX", "ost_BeOS", "ost_HP-UX", "ost_IRIX", "ost_Neutrino", "ost_OpenVMS", "ost_OS/2", "ost_OSF/1", "ost_Solaris", "ost_SunOS", "ost_other"};

	type PriorityType {"pt_null", "pt_P1", "pt_P2", "pt_P3", "pt_P4", "pt_P5"};

	type ReportedPlatformType {"rpt_null", "rpt_all", "rpt_DEC", "rpt_HP", "rpt_Macintosh", "rpt_PC", "rpt_SGI", "rpt_Sun", "rpt_other"};

	type ResolutionType {"rt_null", "rt_FIXED", "rt_INVALID", "rt_WONTFIX", "rt_LATER", "rt_REMIND", "rt_DUPLICATE", "rt_WORKSFORME", "rt_MOVED"};

	type BugzillaRoot {
		Version_Att : Text;
		Urlbase_Att : Text;
		Maintainer_Att : Text;
		Exporter_Att : Text;
		Bugs_ContRef : Bug+;
	};

	type Bug {
		Bug_bugzillaRoot_Ref : BugzillaRoot;
		Error_Att : ErrorType?;
		Bug_id_Att : Text;
		Exporter_Att : Text;
		Urlbase_Att : Text;
		Bug_status_Att : StatusType;
		Resolution_Att : ResolutionType?;
		Product_Att : Text;
		Priority_Att : PriorityType;
		Version_Att : Text;
		Rep_platform_Att : ReportedPlatformType;
		Assigned_to_Att : Text;
		Delta_ts_Att : Text;
		Component_Att : Text;
		Reporter_Att : Text;
		Target_milestone_Att : Text;
		Bug_severity_Att : SeverityType;
		Creation_ts_Att : Text;
		Qa_contact_Att : Text;
		Status_whiteboard_Att : Text;
		Op_sys_Att : OperatingSystemType;
		Bug_file_loc_Att : Text;
		Short_desc_Att : Text;
		Keywords_ContRef : Keywords*;
		Dependson_ContRef : Dependson*;
		Blocks_ContRef : Blocks*;
		Cc_ContRef : Cc*;
		Long_desc_ContRef : LongDesc*;
		Attachment_ContRef : Attachment*;
	};

	type StringElt {
		Value_Att : Text;
	};

	type Keywords : StringElt;

	type Dependson : StringElt;

	type Blocks : StringElt;

	type Cc : StringElt;

	type LongDesc {
		IsPrivate_Att : Logical;
		Who_Att : Text;
		Bug_when_Att : Text;
		Thetext_Att : Text;
	};

	type Attachment {
		IsObsolete_Att : Logical;
		IsPatch_Att : Logical;
		IsPrivate_Att : Logical;
		Id_Att : Text;
		Date_Att : Text;
		Desc_Att : Text;
		Type_Att : Text;
		Data_Att : Text;
	};
}