<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm name="0">
	<cp>
		<constant value="BasicMeasurement"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J;"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="0"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.BToMeasure():V"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__matcher__"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__exec__"/>
		<constant value="getModelName"/>
		<constant value="Names"/>
		<constant value="IN2"/>
		<constant value="J.allInstancesFrom(J):J"/>
		<constant value="J.first():J"/>
		<constant value="modelName"/>
		<constant value="15:40-15:50"/>
		<constant value="15:68-15:73"/>
		<constant value="15:40-15:74"/>
		<constant value="15:40-15:83"/>
		<constant value="15:40-15:93"/>
		<constant value="getClasses"/>
		<constant value="Class"/>
		<constant value="KM3"/>
		<constant value="IN"/>
		<constant value="J.size():J"/>
		<constant value="17:39-17:48"/>
		<constant value="17:66-17:70"/>
		<constant value="17:39-17:71"/>
		<constant value="17:39-17:79"/>
		<constant value="getAttributes"/>
		<constant value="Attribute"/>
		<constant value="19:42-19:55"/>
		<constant value="19:73-19:77"/>
		<constant value="19:42-19:78"/>
		<constant value="19:42-19:86"/>
		<constant value="getReferences"/>
		<constant value="Reference"/>
		<constant value="21:42-21:55"/>
		<constant value="21:73-21:77"/>
		<constant value="21:42-21:78"/>
		<constant value="21:42-21:86"/>
		<constant value="BToMeasure"/>
		<constant value="Measure"/>
		<constant value="BMeasure"/>
		<constant value="J.getModelName():J"/>
		<constant value="J.getClasses():J"/>
		<constant value="totalNumberOfClasses"/>
		<constant value="J.getAttributes():J"/>
		<constant value="totalNumberOfAttributes"/>
		<constant value="J.getReferences():J"/>
		<constant value="totalNumberOfReferences"/>
		<constant value="26:3-30:56"/>
		<constant value="27:15-27:25"/>
		<constant value="27:15-27:40"/>
		<constant value="27:4-27:40"/>
		<constant value="28:26-28:36"/>
		<constant value="28:26-28:49"/>
		<constant value="28:4-28:49"/>
		<constant value="29:29-29:39"/>
		<constant value="29:29-29:55"/>
		<constant value="29:4-29:55"/>
		<constant value="30:29-30:39"/>
		<constant value="30:29-30:55"/>
		<constant value="30:4-30:55"/>
		<constant value="root"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<load arg="7"/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="10"/>
			<call arg="11"/>
			<dup/>
			<push arg="12"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="13"/>
			<call arg="11"/>
			<call arg="14"/>
			<set arg="3"/>
			<load arg="7"/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<load arg="7"/>
			<call arg="16"/>
			<load arg="7"/>
			<call arg="17"/>
			<load arg="7"/>
			<call arg="18"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="26"/>
		</localvariabletable>
	</operation>
	<operation name="20">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="21">
		<context type="6"/>
		<parameters>
			<parameter name="22" type="23"/>
		</parameters>
		<code>
			<load arg="22"/>
			<load arg="7"/>
			<get arg="3"/>
			<call arg="24"/>
			<if arg="25"/>
			<load arg="7"/>
			<get arg="1"/>
			<load arg="22"/>
			<call arg="26"/>
			<dup/>
			<call arg="27"/>
			<if arg="28"/>
			<load arg="22"/>
			<call arg="29"/>
			<goto arg="30"/>
			<pop/>
			<load arg="22"/>
			<goto arg="31"/>
			<push arg="32"/>
			<push arg="9"/>
			<new/>
			<load arg="22"/>
			<iterate/>
			<store arg="33"/>
			<load arg="7"/>
			<load arg="33"/>
			<call arg="34"/>
			<call arg="35"/>
			<enditerate/>
			<call arg="36"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="37" begin="23" end="27"/>
			<lve slot="0" name="19" begin="0" end="29"/>
			<lve slot="1" name="38" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
			<parameter name="22" type="23"/>
			<parameter name="33" type="40"/>
		</parameters>
		<code>
			<load arg="7"/>
			<get arg="1"/>
			<load arg="22"/>
			<call arg="26"/>
			<load arg="22"/>
			<load arg="33"/>
			<call arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="6"/>
			<lve slot="1" name="38" begin="0" end="6"/>
			<lve slot="2" name="42" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="42"/>
			<push arg="45"/>
			<findme/>
			<push arg="46"/>
			<call arg="47"/>
			<call arg="48"/>
			<get arg="49"/>
		</code>
		<linenumbertable>
			<lne id="50" begin="0" end="2"/>
			<lne id="51" begin="3" end="3"/>
			<lne id="52" begin="0" end="4"/>
			<lne id="53" begin="0" end="5"/>
			<lne id="54" begin="0" end="6"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="55">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="56"/>
			<push arg="57"/>
			<findme/>
			<push arg="58"/>
			<call arg="47"/>
			<call arg="59"/>
		</code>
		<linenumbertable>
			<lne id="60" begin="0" end="2"/>
			<lne id="61" begin="3" end="3"/>
			<lne id="62" begin="0" end="4"/>
			<lne id="63" begin="0" end="5"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="64">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="65"/>
			<push arg="57"/>
			<findme/>
			<push arg="58"/>
			<call arg="47"/>
			<call arg="59"/>
		</code>
		<linenumbertable>
			<lne id="66" begin="0" end="2"/>
			<lne id="67" begin="3" end="3"/>
			<lne id="68" begin="0" end="4"/>
			<lne id="69" begin="0" end="5"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="70">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="71"/>
			<push arg="57"/>
			<findme/>
			<push arg="58"/>
			<call arg="47"/>
			<call arg="59"/>
		</code>
		<linenumbertable>
			<lne id="72" begin="0" end="2"/>
			<lne id="73" begin="3" end="3"/>
			<lne id="74" begin="0" end="4"/>
			<lne id="75" begin="0" end="5"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="19" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="76">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="77"/>
			<push arg="78"/>
			<new/>
			<store arg="22"/>
			<load arg="22"/>
			<dup/>
			<load arg="7"/>
			<getasm/>
			<call arg="79"/>
			<call arg="34"/>
			<set arg="49"/>
			<dup/>
			<load arg="7"/>
			<getasm/>
			<call arg="80"/>
			<call arg="34"/>
			<set arg="81"/>
			<dup/>
			<load arg="7"/>
			<getasm/>
			<call arg="82"/>
			<call arg="34"/>
			<set arg="83"/>
			<dup/>
			<load arg="7"/>
			<getasm/>
			<call arg="84"/>
			<call arg="34"/>
			<set arg="85"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="86" begin="0" end="3"/>
			<lne id="87" begin="7" end="7"/>
			<lne id="88" begin="7" end="8"/>
			<lne id="89" begin="5" end="10"/>
			<lne id="90" begin="13" end="13"/>
			<lne id="91" begin="13" end="14"/>
			<lne id="92" begin="11" end="16"/>
			<lne id="93" begin="19" end="19"/>
			<lne id="94" begin="19" end="20"/>
			<lne id="95" begin="17" end="22"/>
			<lne id="96" begin="25" end="25"/>
			<lne id="97" begin="25" end="26"/>
			<lne id="98" begin="23" end="28"/>
			<lne id="86" begin="4" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="99" begin="3" end="29"/>
			<lve slot="0" name="19" begin="0" end="29"/>
		</localvariabletable>
	</operation>
</asm>
