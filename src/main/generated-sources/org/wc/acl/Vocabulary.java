
package org.wc.acl;

import org.semanticweb.owlapi.model.IRI;


/**
 * This class was generated by OWL2Java 0.14.0
 * 
 */
public class Vocabulary {

    public final static String ONTOLOGY_IRI_generated = "http://www.w3.org/ns/auth/acl#-generated";
    public final static String s_c_Thing = "http://www.w3.org/2002/07/owl#Thing";
    public final static IRI c_Thing = IRI.create(s_c_Thing);
    public final static String s_c_Class = "http://www.w3.org/2000/01/rdf-schema#Class";
    public final static IRI c_Class = IRI.create(s_c_Class);
    public final static String s_c_InformationResource = "http://www.w3.org/2006/gen/ont#InformationResource";
    public final static IRI c_InformationResource = IRI.create(s_c_InformationResource);
    public final static String s_c_Group = "http://www.w3.org/2006/vcard/ns#Group";
    public final static IRI c_Group = IRI.create(s_c_Group);
    /**
     * Any kind of access to a resource. Don't use this, use R W and RW
     * 
     */
    public final static String s_c_Access = "http://www.w3.org/ns/auth/acl#Access";
    public final static IRI c_Access = IRI.create(s_c_Access);
    /**
     * Append accesses are specific write access which only add information, and do not remove information.
     *     For text files, for example, append access allows bytes to be added onto the end of the file.
     *     For RDF graphs, Append access allows adds triples to the graph but does not remove any.
     *     Append access is useful for dropbox functionality.
     *     Dropbox can be used for link notification, which the information added is a notification
     *     that a some link has been made elsewhere relevant to the given resource.
     *     
     * 
     */
    public final static String s_c_Append = "http://www.w3.org/ns/auth/acl#Append";
    public final static IRI c_Append = IRI.create(s_c_Append);
    /**
     * A class of agents who have been authenticated.
     * In other words, anyone can access this resource, but not anonymously.
     * The social expectation is that the authentication process will provide an
     * identify and a name, or pseudonym.
     * (A new ID should not be minted for every access: the intent is that the user
     * is able to continue to use the ID for continues interactions with peers,
     * and for example to develop a reputation)
     * 
     * 
     */
    public final static String s_c_AuthenticatedAgent = "http://www.w3.org/ns/auth/acl#AuthenticatedAgent";
    public final static IRI c_AuthenticatedAgent = IRI.create(s_c_AuthenticatedAgent);
    /**
     * An element of access control,
     *     allowing agent to agents access of some kind to resources or classes of resources
     * 
     */
    public final static String s_c_Authorization = "http://www.w3.org/ns/auth/acl#Authorization";
    public final static IRI c_Authorization = IRI.create(s_c_Authorization);
    /**
     * Allows read/write access to the ACL for the resource(s)
     * 
     */
    public final static String s_c_Control = "http://www.w3.org/ns/auth/acl#Control";
    public final static IRI c_Control = IRI.create(s_c_Control);
    /**
     * An Origin is basically a web site
     *         (Note WITHOUT the trailing slash after the domain name and port in its URI)
     *         and is the basis for controlling access to data by web apps
     *         in the Same Origin Model of web security.
     *         All scripts from the same origin are given the same right.
     * 
     */
    public final static String s_c_Origin = "http://www.w3.org/ns/auth/acl#Origin";
    public final static IRI c_Origin = IRI.create(s_c_Origin);
    /**
     * The class of read operations
     * 
     */
    public final static String s_c_Read = "http://www.w3.org/ns/auth/acl#Read";
    public final static IRI c_Read = IRI.create(s_c_Read);
    public final static String s_c_Write = "http://www.w3.org/ns/auth/acl#Write";
    public final static IRI c_Write = IRI.create(s_c_Write);
    public final static String s_c_Agent = "http://xmlns.com/foaf/0.1/Agent";
    public final static IRI c_Agent = IRI.create(s_c_Agent);
    /**
     * The information resource to which access is being granted.
     * 
     */
    public final static String s_p_accessTo = "http://www.w3.org/ns/auth/acl#accessTo";
    public final static IRI p_accessTo = IRI.create(s_p_accessTo);
    /**
     * A class of information resources to which access is being granted.
     * 
     */
    public final static String s_p_accessToClass = "http://www.w3.org/ns/auth/acl#accessToClass";
    public final static IRI p_accessToClass = IRI.create(s_p_accessToClass);
    /**
     * A person or social entity to being given the right
     * 
     */
    public final static String s_p_agent = "http://www.w3.org/ns/auth/acl#agent";
    public final static IRI p_agent = IRI.create(s_p_agent);
    /**
     * A class of persons or social entities to being given the right
     * 
     */
    public final static String s_p_agentClass = "http://www.w3.org/ns/auth/acl#agentClass";
    public final static IRI p_agentClass = IRI.create(s_p_agentClass);
    /**
     * A group of persons or social entities to being given the right.
     *           The right is given to any entity which is a vcard:member of the group,
     *           as defined by the document received when the Group is dereferenced.
     * 
     */
    public final static String s_p_agentGroup = "http://www.w3.org/ns/auth/acl#agentGroup";
    public final static IRI p_agentGroup = IRI.create(s_p_agentGroup);
    /**
     * Delegates a person or another agent to act on behalf of the agent.
     *     For example, Alice delegates Bob to act on behalf of Alice for ACL purposes.
     * 
     */
    public final static String s_p_delegates = "http://www.w3.org/ns/auth/acl#delegates";
    public final static IRI p_delegates = IRI.create(s_p_delegates);
    /**
     * A mode of access such as read or write.
     * 
     */
    public final static String s_p_mode = "http://www.w3.org/ns/auth/acl#mode";
    public final static IRI p_mode = IRI.create(s_p_mode);
    /**
     * A web application, identified by its Origin, such as
     *         <https://scripts.example.com>, being given the right.
     *         When a user of the web application at a certain origin accesses the server,
     *         then the browser sets the Origin: header to warn that a possibly untrusted webapp
     *         is being used.
     *         Then, BOTH the user AND the origin must have the required access.
     * 
     */
    public final static String s_p_origin = "http://www.w3.org/ns/auth/acl#origin";
    public final static IRI p_origin = IRI.create(s_p_origin);
    /**
     * The person or other agent which owns this.
     *     For example, the owner of a file in a filesystem.
     *     There is a sense of right to control.   Typically defaults to the agent who craeted
     *     something but can be changed.
     * 
     */
    public final static String s_p_owner = "http://www.w3.org/ns/auth/acl#owner";
    public final static IRI p_owner = IRI.create(s_p_owner);
    public final static String s_p_describes = "http://purl.org/dc/elements/1.1/describes";
    public final static IRI p_describes = IRI.create(s_p_describes);
    public final static String s_p_title = "http://purl.org/dc/elements/1.1/title";
    public final static IRI p_title = IRI.create(s_p_title);
    public final static String s_p_comment = "http://www.w3.org/2000/01/rdf-schema#comment";
    public final static IRI p_comment = IRI.create(s_p_comment);
    public final static String s_p_label = "http://www.w3.org/2000/01/rdf-schema#label";
    public final static IRI p_label = IRI.create(s_p_label);
    public final static String s_p_seeAlso = "http://www.w3.org/2000/01/rdf-schema#seeAlso";
    public final static IRI p_seeAlso = IRI.create(s_p_seeAlso);
    /**
     * The Access Control file for this information resource.
     *         This may of course be a virtual resource implemented by the access control system.
     *         Note also HTTP's header  Link:  foo.meta ;rel=meta can be used for this.
     * 
     */
    public final static String s_p_accessControl = "http://www.w3.org/ns/auth/acl#accessControl";
    public final static IRI p_accessControl = IRI.create(s_p_accessControl);
    /**
     * If a resource has no ACL file (it is 404),
     *         then access to the resource if given by the ACL of the immediately
     *         containing directory, or failing that (404) the ACL of the recursively next
     *         containing directory which has an ACL file.
     *         Within that ACL file,
     *         any Authentication which has that directory as its acl:default applies to the
     *         resource. (The highest directory must have an ACL file.)
     * 
     * 
     */
    public final static String s_p__default = "http://www.w3.org/ns/auth/acl#default";
    public final static IRI p__default = IRI.create(s_p__default);
    /**
     * THIS IS OBSOLETE AS OF 2017-08-01.   See 'default'.
     *         Was: A directory for which this authorization is used for new files in the directory.
     * 
     */
    public final static String s_p_defaultForNew = "http://www.w3.org/ns/auth/acl#defaultForNew";
    public final static IRI p_defaultForNew = IRI.create(s_p_defaultForNew);
    public final static String s_p_label_A = "http://www.w3.org/ns/auth/acl#label";
    public final static IRI p_label_A = IRI.create(s_p_label_A);

}
