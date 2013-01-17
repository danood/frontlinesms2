package frontlinesms2

class JoinActionStep extends Step {
	
	static service = 'subscription'
	static action = 'doJoin'
	static String getShortName() { 'join' }

	static configFields = [group: Group]

	static constraints = {
	}

	def getGroup() {
		Group.get(getPropertyValue("group"))	
	}

	def setGroup(Group group) {
		setPropertyValue("group", group.id)
	}

	def process(Fmessage message) {

	}
}
